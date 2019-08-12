package com.chau.yoyoshop.RestClient;

import com.chau.yoyoshop.Model.ObjectClass.User;
import com.chau.yoyoshop.View.TrangChu.TrangChuActivity;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class UserRestImpl implements UserRest {

    private  String apiURL = TrangChuActivity.yoyoURL+"xulidangnhap/";
    private RestTemplate restTemplate = new RestTemplate();

    // trong hàm xử lý đăng nhập này nó sẽ
    // gửi yêu câu http get đến server xử lý, nếu thánh công trả về true
    @Override
    public boolean xulydangnhap(User user) {

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("username",user.getUsername());
            map.add("password",user.getPassword());

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

//            ResponseEntity<String> response = restTemplate.postForEntity( apiURL, request , String.class );

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
