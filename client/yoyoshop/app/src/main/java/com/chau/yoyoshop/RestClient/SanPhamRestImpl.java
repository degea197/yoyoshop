package com.chau.yoyoshop.RestClient;

import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class SanPhamRestImpl implements SanPhamRest {


    private  String apiURL = TrangChuActivity.yoyoURL+"loaisanpham/";
    private RestTemplate restTemplate = new RestTemplate();

    public SanPhamRestImpl() {
    }
    public SanPhamRestImpl(String id) {
        apiURL+=id;
    }

    @Override
    public List<SanPham> getAllSanPHam() {
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
    public SanPham getSanPHam(int theid) {
        return null;
    }


}


//
//
//    public Customer find(int id){
//        try {
//            return restTemplate.exchange(
//                    BASE_URL+"/"+id,
//                    HttpMethod.GET,
//                    null,
//                    new ParameterizedTypeReference<Customer>(){
//                    }
//            ).getBody();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return  null;
//        }
//    }
//
//    public boolean create(Customer customer) {
//        try {
//            Map<String, String> values = new HashMap<>();
//            values.put("firstName",customer.getFirsName());
//            values.put("lastName",customer.getLastName());
//            values.put("email",customer.getEmail());
//            JSONObject jsonObject = new JSONObject(values);
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            HttpEntity<String> entity = new HttpEntity<>(jsonObject.toString(), headers);
//            restTemplate.postForEntity(BASE_URL + "/create",entity,null);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public boolean delete(int id) {
//        try {
//            restTemplate.delete(BASE_URL+"/delete/"+id);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//
//    public boolean update(Customer customer) {
//        try {
//            Map<String, String> values = new HashMap<>();
//            values.put("id",String.valueOf(customer.getId()));
//            values.put("first_name",customer.getFirsName());
//            values.put("last_name",customer.getLastName());
//            values.put("email",customer.getEmail());
//            JSONObject jsonObject = new JSONObject(values);
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            HttpEntity<String> entity = new HttpEntity<>(jsonObject.toString(), headers);
//            restTemplate.put(BASE_URL + "/update",entity);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }

