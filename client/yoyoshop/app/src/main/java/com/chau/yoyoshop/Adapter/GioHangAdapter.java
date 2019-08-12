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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import java.io.InputStream;
import java.util.List;

import static com.facebook.FacebookSdk.getApplicationContext;

public class GioHangAdapter extends RecyclerView.Adapter<GioHangAdapter.GioHangViewHolder> {


    private Context mCtx;
    private List<SanPham> listSanPham;
    private  SanPham sp;

    public GioHangAdapter(Context mCtx, List<SanPham> listSanPham) {
        this.mCtx = mCtx;
        this.listSanPham = listSanPham;
    }

    @Override
    public GioHangViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.custom_layout_giohang, null);
        return new GioHangViewHolder(view);
    }

    // xử lý từng sản phẩm trong list sản phẩm đó và hiện lên cho người dùng
    // với mỗi sản phẩm đc lấy ra, và giá trị của sản phẩm đó sẽ đc set vào các textview,imageview thông
    // qua GioHangViewHolder đc tạo ở dưới
    @Override
    public void onBindViewHolder(GioHangViewHolder holder, int position) {
        sp = listSanPham.get(position);
        System.out.println(sp.getTENSP());
        holder.txtTieuDeGioHang.setText(sp.getTENSP());
        holder.txtGiaGioHang.setText(String.valueOf(sp.getGIA()));

        String anh = sp.getANHLON().substring(0, sp.getANHLON().indexOf("."));
        System.out.println(anh);
        new DownloadImageFromInternet(holder.imHinhGioHang)
                .execute(TrangChuActivity.yoyoURL+"image"+anh);
    }

    @Override
    public int getItemCount() {
        return listSanPham.size();
    }


    // GioHangViewHolder sẽ sử lí các txt, im và gửi lên cho người dùng
    public class GioHangViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        ImageView imHinhGioHang;
        TextView txtTieuDeGioHang,txtGiaGioHang,txtGiamGiaGioHang,txtSoLuongSanPham,txttotalPrice;

        public GioHangViewHolder(View itemView) {
            super(itemView);
            imHinhGioHang = itemView.findViewById(R.id.imHinhGioHang);
            txtTieuDeGioHang = (TextView) itemView.findViewById(R.id.txtTieuDeGioHang);
            txtGiaGioHang = (TextView) itemView.findViewById(R.id.txtGiaGioHang);
            txtSoLuongSanPham = (TextView) itemView.findViewById(R.id.txtSoLuongSanPham);
        }

        @Override
        public void onClick(View v) {
        }
    }


    // hiển thị ảnh từ server về
    private class DownloadImageFromInternet extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView;

        public DownloadImageFromInternet(ImageView imageView) {
            this.imageView = imageView;
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
