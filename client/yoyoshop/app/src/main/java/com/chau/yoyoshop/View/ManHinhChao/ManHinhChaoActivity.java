package com.chau.yoyoshop.View.ManHinhChao;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.chau.yoyoshop.View.TrangChu.TestActivity;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;
import com.chau.yoyoshop.R;


public class ManHinhChaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhchao_layout);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                }catch (Exception e){

                }finally {
                    Intent iTrangChu = new Intent(ManHinhChaoActivity.this, TrangChuActivity.class);
                    startActivity(iTrangChu);
//                    Intent iTest = new Intent(ManHinhChaoActivity.this, TestActivity.class);
//                    startActivity(iTest);

                }
            }
        });

        thread.start();
    }


}
