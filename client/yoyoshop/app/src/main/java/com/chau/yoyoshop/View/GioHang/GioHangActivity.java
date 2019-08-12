package com.chau.yoyoshop.View.GioHang;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chau.yoyoshop.Adapter.SanPhamAdapter;
import com.chau.yoyoshop.Adapter.GioHangAdapter;
import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.ThanhToan.ThanhToanActivity;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

public class GioHangActivity extends AppCompatActivity {

    RecyclerView recyclerGioHang;
    Button btnMuaNgay;
    TextView txttotalPrice;
    double totalPrice = 0;


    //
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_giohang);

        recyclerGioHang = (RecyclerView) findViewById(R.id.recyclerGioHang);
        btnMuaNgay = (Button) findViewById(R.id.btnMuaNgay);

        // khởi tạo giỏ hàng adapter với tham số truyền vào là 1 list các hàng hóa đã chọn ở phẩn trước
        // để xử lý recyclerview sau đó hiện sản phẩm lên cho người dùng
        GioHangAdapter gioHangAdapter = new GioHangAdapter(this, TrangChuActivity.listGiohang);
        SanPhamAdapter dientuAdapter12 = new SanPhamAdapter(this, TrangChuActivity.listGiohang);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerGioHang.setLayoutManager(layoutManager);
        recyclerGioHang.setAdapter(gioHangAdapter);

        txttotalPrice = (TextView) findViewById(R.id.txttotalPrices);


        //  Tong tien nó sẽ cộng dồn từ giá của các sản phẩm
        for(SanPham sp : TrangChuActivity.listGiohang){
            totalPrice +=sp.getGIA();
        }

        txttotalPrice.setText("Tổng tiền: "+String.valueOf(totalPrice)+"vnd");

        btnMuaNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GioHangActivity.this, ThanhToanActivity.class);
                startActivity(intent);
            }
        });
    }

}
