package com.chau.yoyoshop.View.ThanhToan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import static com.facebook.FacebookSdk.getApplicationContext;

public class ThanhToanActivity extends AppCompatActivity {

    Button btnThanhToan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_thanhtoan);

        btnThanhToan = (Button) findViewById(R.id.btnThanhToan);

        btnThanhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mua hàng thành công ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThanhToanActivity.this, TrangChuActivity.class);
                startActivity(intent);
            }
        });
    }
}
