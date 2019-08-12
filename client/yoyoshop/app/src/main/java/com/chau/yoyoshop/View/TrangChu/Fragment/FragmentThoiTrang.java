package com.chau.yoyoshop.View.TrangChu.Fragment;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chau.yoyoshop.Adapter.SanPhamAdapter;
import com.chau.yoyoshop.RestClient.SanPhamRestImpl;
import com.chau.yoyoshop.Model.ObjectClass.DienTu;
import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentThoiTrang extends Fragment {
    RecyclerView recyclerView;
    List<DienTu> listDienTu;
    List<SanPham> listSanPham;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_thoitrang, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerThoiTrang);

        listDienTu = new ArrayList<>();
        try {
            listSanPham = new AsyncTask<Void,Void,List<SanPham>>(){
                @Override
                protected List<SanPham> doInBackground(Void... voids) {
                    SanPhamRestImpl sanPhamDAO = new SanPhamRestImpl("154");
                    return sanPhamDAO.getAllSanPHam();
                }
            }.execute().get();

        }catch (Exception e){
            e.printStackTrace();
        }

        SanPhamAdapter dientuAdapter12 = new SanPhamAdapter(getContext(), listSanPham);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dientuAdapter12);

        dientuAdapter12.notifyDataSetChanged();


        return  view;
    }
}
