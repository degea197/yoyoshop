package com.chau.yoyoshop.View.DangNhap;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chau.yoyoshop.RestClient.UserRest;
import com.chau.yoyoshop.RestClient.UserRestImpl;
import com.chau.yoyoshop.Model.ObjectClass.User;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

public class DangNhapActivity extends AppCompatActivity {

    Button btnDangNhap;
    EditText edUserName;
    EditText edPassword;
    User user;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment_dangnhap);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        edUserName = (EditText) findViewById(R.id.edUserName);
        edPassword = (EditText) findViewById(R.id.edPassword);

        user = new User(edUserName.getText().toString(), edPassword.getText().toString());

//  class bắt sự kiện click của button, nó sẽ tạo ra một đối tượng UserRest và gọi đến hàm xử
        // lý đăng nhập
        try {
            btnDangNhap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        UserRest userDAO = new UserRestImpl();
                        boolean result  = userDAO.xulydangnhap(user);
                        if (result == true) {
                            TrangChuActivity.title = "Hi,"+ user.getUsername();
                            Toast.makeText(getApplicationContext()  , "đăng nhập thành công", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(DangNhapActivity.this, TrangChuActivity.class);
                            startActivity(intent);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
