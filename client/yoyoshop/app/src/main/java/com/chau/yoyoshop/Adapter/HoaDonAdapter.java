package com.chau.yoyoshop.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chau.yoyoshop.Model.ObjectClass.HoaDon;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import java.io.InputStream;
import java.util.List;

public class HoaDonAdapter extends RecyclerView.Adapter<HoaDonAdapter.HoaDonViewHolder> {

    private Context mCtx;
    private List<HoaDon> listHoaDon;
    private HoaDon hd;

    public HoaDonAdapter(Context mCtx,List<HoaDon> listHoaDon){
        this.mCtx = mCtx;
        this.listHoaDon = listHoaDon;
    }

    @Override
    public HoaDonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        System.out.println("llllllllllllllllllllllllllllll");
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.custom_layout_hoadon, null);
        return new HoaDonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HoaDonViewHolder holder, int position) {
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        hd = listHoaDon.get(position);
        holder.tvhttt .setText(holder.tvhttt.getText()+hd.getHINHTHUCTHANHTOAN());
        holder.tvNgayGiao.setText(holder.tvNgayGiao.getText()+hd.getNGAYGIAO());
        holder.tvNgayMua.setText(holder.tvNgayMua.getText()+hd.getNGAYMUA());
        holder.tvTongTien.setText(holder.tvTongTien.getText()+String.valueOf(hd.getTONGTIEN()));
        holder.tvTrangThai.setText(holder.tvTrangThai.getText()+hd.getTRANGTHAI());
        String anh = hd.getANH().substring(0, hd.getANH().indexOf("."));
        new DownloadImageFromInternet(holder.imHinhHoaDon)
                .execute(TrangChuActivity.yoyoURL+"image"+anh);
    }

    @Override
    public int getItemCount() {
        return listHoaDon.size();
    }

    public class HoaDonViewHolder extends RecyclerView.ViewHolder{
        ImageView imHinhHoaDon;
        TextView tvNgayMua,tvNgayGiao,tvTrangThai,tvhttt,tvTongTien;

        public HoaDonViewHolder(View itemView) {
            super(itemView);
            imHinhHoaDon = itemView.findViewById(R.id.imHinhHoaDon);
            tvNgayMua = itemView.findViewById(R.id.tvNgayMua);
            tvNgayGiao = itemView.findViewById(R.id.tvNgayGiao);
            tvhttt = itemView.findViewById(R.id.tvhttt);
            tvTrangThai = itemView.findViewById(R.id.tvTrangThai);
            tvTongTien = itemView.findViewById(R.id.tvTongTien);

        }
    }

    private class DownloadImageFromInternet extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView;

        public DownloadImageFromInternet(ImageView imageView) {
            this.imageView = imageView;
//            Toast.makeText(getApplicationContext(), "Please wait, it may take a few minute...", Toast.LENGTH_SHORT).show();
        }

        protected Bitmap doInBackground(String... urls) {
            String imageURL = urls[0];
            Bitmap bimage = null;
            try {
                InputStream in = new java.net.URL(imageURL).openStream();
                bimage = BitmapFactory.decodeStream(in);

            } catch (Exception e) {
                Log.e("Error Message", e.getMessage());
                e.printStackTrace();
            }
            return bimage;
        }

        protected void onPostExecute(Bitmap result) {
            imageView.setImageBitmap(result);
        }
    }

}
