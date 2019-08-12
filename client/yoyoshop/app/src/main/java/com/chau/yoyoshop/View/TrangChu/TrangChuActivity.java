package com.chau.yoyoshop.View.TrangChu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chau.yoyoshop.Adapter.ViewPagerAdapter;
import com.chau.yoyoshop.Model.ObjectClass.HoaDon;
import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.DangNhap.DangNhapActivity;
import com.chau.yoyoshop.View.GioHang.GioHangActivity;
import com.chau.yoyoshop.View.HoaDon.HoaDonActivity;
import com.facebook.FacebookSdk;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TrangChuActivity extends AppCompatActivity{


    public static String yoyoURL = "http://192.168.137.1:8080/spring-crm-rest/api/";
    public static List<SanPham> listGiohang;
    public  static String title="";

    public static int count = 0;
    public static Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private TextView txtSoLuongSanPhamGioHang;

//    private ImageView ivGioHang;

    private Button ivGioHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        listGiohang = new ArrayList<>();
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.trangchu_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        ivGioHang = (ImageView) findViewById(R.id.ivGioHang);
        ivGioHang = (Button) findViewById(R.id.ivGioHang);
        txtSoLuongSanPhamGioHang = (TextView) findViewById(R.id.txtSoLuongSanPhamGioHang);

        toolbar.setTitle(title);
        setSupportActionBar(toolbar);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }


    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menutrangchu,menu);
//        MenuItemCompat
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itGioHang:
                Intent intent = new Intent(TrangChuActivity.this, GioHangActivity.class);
                startActivity(intent);
                return true;

            case R.id.itDangNhap:
                Intent intent1 = new Intent(TrangChuActivity.this, DangNhapActivity.class);
                startActivity(intent1);
                return true;
            case R.id.itSearch:
                System.out.println("seachhhhhhhhhhhhhhhhhhh");
                return true;
            case R.id.itDonHangCuaToi:
                Intent intent2 = new Intent(TrangChuActivity.this, HoaDonActivity.class);
                startActivity(intent2);
                return true;


            default:
                System.out.println("default...........");
                return true;
        }
    }


}

