package com.chau.yoyoshop.View.TrangChu.Fragment;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chau.yoyoshop.Adapter.SanPhamAdapter;
import com.chau.yoyoshop.RestClient.SanPhamRestImpl;
import com.chau.yoyoshop.Model.ObjectClass.DienTu;
import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.Model.ObjectClass.ThuongHieu;
import com.chau.yoyoshop.R;
import com.chau.yoyoshop.View.TrangChu.ViewDienTu;

import java.util.ArrayList;
import java.util.List;

public class FragmentDienTu extends Fragment implements ViewDienTu {


    RecyclerView recyclerView,recylerTopCacThuongHieuLon,recylerHangMoiVe;
    List<DienTu> listDienTu;
    ImageView imSanPham1,imSanPham2,imSanPham3;
    TextView txtSanPham1,txtSanPham2,txtSanPham3;
    List<SanPham> listSanPham;


    public static int count = 0;




    @SuppressLint("StaticFieldLeak")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_dientu, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerDienTu);
        recylerTopCacThuongHieuLon = (RecyclerView) view.findViewById(R.id.recylerTopCacThuongHieuLon);
        recylerHangMoiVe = (RecyclerView) view.findViewById(R.id.recylerHangMoiVe);
        imSanPham1 = (ImageView) view.findViewById(R.id.imSanPham1);
        imSanPham2 = (ImageView) view.findViewById(R.id.imSanPham2);
        imSanPham3 = (ImageView) view.findViewById(R.id.imSanPham3);
        txtSanPham1 = (TextView) view.findViewById(R.id.txtSanPham1);
        txtSanPham2 = (TextView) view.findViewById(R.id.txtSanPham2);
        txtSanPham3 = (TextView) view.findViewById(R.id.txtSanPham3);

//        presenterLogicDienTu = new PresenterLogicDienTu(this);
//        presenterLogicDienTu.LayDanhSachDienTu();
        listDienTu = new ArrayList<>();

        try {
            listSanPham = new AsyncTask<Void,Void,List<SanPham>>(){
                @Override
                protected List<SanPham> doInBackground(Void... voids) {
                    SanPhamRestImpl sanPhamDAO = new SanPhamRestImpl("11");
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

//        btnaddtocart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count++;
//                txtSoLuongSanPhamGioHang.setText(String.valueOf(count));
//            }
//        });


        return view;
    }



    @Override
    public void HienThiDanhSach(List<DienTu> listdienTu) {
//        listDienTu = listdienTu;
//        recyclerView.setHasFixedSize(true);
//        DienTuAdapter dienTuAdapter = new DienTuAdapter(getContext(), listDienTu);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(dienTuAdapter);
//
//        dienTuAdapter.notifyDataSetChanged();

    }

    @Override
    public void HienThiLogoThuongHieu(List<ThuongHieu> thuongHieus) {

    }

    @Override
    public void LoiLayDuLieu() {

    }

    @Override
    public void HienThiSanPhamMoiVe(List<SanPham> sanPhams) {

    }
}
