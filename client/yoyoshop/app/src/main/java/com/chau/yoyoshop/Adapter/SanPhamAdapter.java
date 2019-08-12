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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import java.io.InputStream;
import java.util.List;

import static com.facebook.FacebookSdk.getApplicationContext;

public class SanPhamAdapter extends RecyclerView.Adapter<SanPhamAdapter.DtViewHolder> {

    private Context mCtx;
    private List<SanPham> listSanPham;
    private  SanPham sp;

    private RecyclerView mRecyclerView;

    TextView txtSoLuongSanPhamGioHang;

    public SanPhamAdapter(Context mCtx, List<SanPham> listSanPham) {
        this.mCtx = mCtx;
        this.listSanPham = listSanPham;
    }

    public SanPhamAdapter(Context mCtx, List<SanPham> listSanPham, TextView txtSoLuongSanPhamGioHang) {
        this.mCtx = mCtx;
        this.listSanPham = listSanPham;
        this.txtSoLuongSanPhamGioHang = txtSoLuongSanPhamGioHang;
    }

    @Override
    public DtViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.custom_layout_recyclerview_dientu1, null);
        return new DtViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DtViewHolder holder, int position) {
        sp = listSanPham.get(position);

        holder.textViewTitle.setText(sp.getTENSP());
        holder.textViewPrice.setText(String.valueOf(sp.getGIA()));
        holder.textViewShortDesc.setText(sp.getTHONGTIN());
        holder.textViewRating.setText(String.valueOf(sp.getSOLUONG()));
        String anh = sp.getANHLON().substring(0, sp.getANHLON().indexOf("."));
        System.out.println(anh);
//        new DownloadImageFromInternet(holder.imageView)
//                .execute("http://192.168.1.238:8080/spring-crm-rest/api/image"+anh);

        new DownloadImageFromInternet(holder.imageView)
                .execute(TrangChuActivity.yoyoURL+"image"+anh);

    }

    @Override
    public int getItemCount() {
        return listSanPham.size();
    }

    public class DtViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

         Button btnaddtocart;


        public DtViewHolder(View itemView) {

            super(itemView);
            mRecyclerView = itemView.findViewById(R.id.recyclerDienTu);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
            txtSoLuongSanPhamGioHang = (TextView) itemView.findViewById(R.id.txtSoLuongSanPhamGioHang);
            btnaddtocart = (Button) itemView.findViewById(R.id.btnaddtocart);

            btnaddtocart.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(v.getId()==btnaddtocart.getId()){
                Toast.makeText(getApplicationContext(), "Đã thêm vào giỏ hàng  ", Toast.LENGTH_SHORT).show();
//                TrangChuActivity.count++;
//                txtSoLuongSanPhamGioHang.setText(String.valueOf(TrangChuActivity.count));

                SanPham sp = listSanPham.get( getAdapterPosition());
                TrangChuActivity.listGiohang.add(sp);
                System.out.println("gio hang");
                System.out.println(sp.getTENSP());
                System.out.println(sp.getGIA());
            }

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
