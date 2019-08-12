package com.chau.yoyoshop.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.TextView;

import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentDienTu;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentKhuyenMai;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentLamDep;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentMevaBe;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentNhaCua;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentNoiBat;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentTheThaoVaDuLich;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentThoiTrang;
import com.chau.yoyoshop.View.TrangChu.Fragment.FragmentThuongHieu;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> listFragment = new ArrayList<Fragment>();
    private List<String> titleFragment = new ArrayList<String>();

    private TextView textView;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        listFragment.add(new FragmentNoiBat());
        listFragment.add(new FragmentKhuyenMai());
        listFragment.add(new FragmentDienTu());
        listFragment.add(new FragmentLamDep());
        listFragment.add(new FragmentMevaBe());
        listFragment.add(new FragmentNhaCua());
        listFragment.add(new FragmentTheThaoVaDuLich());
        listFragment.add(new FragmentThoiTrang());
        listFragment.add(new FragmentThuongHieu());

        titleFragment.add("Nổi bật");
        titleFragment.add("Khuyến mãi");
        titleFragment.add("ĐIện tử");
        titleFragment.add("Làm đẹp");
        titleFragment.add("Mẹ và bé");
        titleFragment.add("Nhà cửa");
        titleFragment.add("Thể thao & du lịch");
        titleFragment.add("Thời trang");
        titleFragment.add("Thương hiệu");


    }



    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleFragment.get(position);
    }
}
