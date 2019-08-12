package com.chau.yoyoshop.RestClient;

import com.chau.yoyoshop.Model.ObjectClass.HoaDon;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class HoaDonRestImpl implements HoaDonRest {

    private  String apiURL = TrangChuActivity.yoyoURL+"hoadon/";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<HoaDon> getallHoaDon() {
        List<HoaDon> listHoaDon=null;
        try {
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            HoaDon[] hd = restTemplate.getForObject(apiURL, HoaDon[].class);
            listHoaDon = Arrays.asList(hd);
            return listHoaDon;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
