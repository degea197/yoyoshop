package com.chau.yoyoshop.Model.TrangChu_DienTu;

import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.Model.ObjectClass.ThuongHieu;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class ModelDienTu implements IModelDienTu {

//    private  String apiURL = "http://192.168.1.238:8080/spring-crm-rest/api/sanpham";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<SanPham> LayDanhSachSanPhamTOP() {
        String apiURL = TrangChuActivity.yoyoURL+"loaisanpham/2";
        List<SanPham> listSanPham;
        try {
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            SanPham[] sp = restTemplate.getForObject(apiURL, SanPham[].class);
            listSanPham = Arrays.asList(sp);
            return listSanPham;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ThuongHieu> LayDanhSachThuongHieuLon() {
        String apiURL = TrangChuActivity.yoyoURL+"thuonghieu";
        List<ThuongHieu> listThuongHieu;
        try {
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            ThuongHieu[] th = restTemplate.getForObject(apiURL, ThuongHieu[].class);
            listThuongHieu = Arrays.asList(th);
            return  listThuongHieu;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
