package com.chau.yoyoshop.View.HoaDon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.chau.yoyoshop.Adapter.HoaDonAdapter;
import com.chau.yoyoshop.RestClient.HoaDonRestImpl;
import com.chau.yoyoshop.Model.ObjectClass.HoaDon;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import java.util.ArrayList;
import java.util.List;

public class HoaDonActivity  extends AppCompatActivity {

    RecyclerView recyclerHoaDon;
    Button btnHoaDon;
    List<HoaDon> listHoadon;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hoadon);

        recyclerHoaDon = (RecyclerView) findViewById(R.id.recyclerHoaDon);
        btnHoaDon = (Button) findViewById(R.id.btnHoaDon);
        listHoadon = new ArrayList<>();
        try {
            listHoadon = new AsyncTask<Void,Void,List<HoaDon>>(){

                @SuppressLint("WrongThread")
                @Override
                protected List<HoaDon> doInBackground(Void... voids) {
                    HoaDonRestImpl hoaDonDAO = new HoaDonRestImpl();
                    return hoaDonDAO.getallHoaDon();
                }
            }.execute().get();

            for (HoaDon hd : listHoadon) {
                System.out.println("====================");
                System.out.println(hd.getTONGTIEN());
                System.out.println("====================");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        HoaDonAdapter hoaDonAdapter = new HoaDonAdapter(this, listHoadon);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerHoaDon.setLayoutManager(layoutManager);
        recyclerHoaDon.setAdapter(hoaDonAdapter);

        btnHoaDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HoaDonActivity.this, TrangChuActivity.class);
                startActivity(intent);
            }
        });

    }
}
