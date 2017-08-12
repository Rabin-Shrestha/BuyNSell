package edu.mum.client.services;

import edu.mum.client.model.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rabin Shrestha on 8/12/2017.
 */
@Service
public class UserService {
    private final RestTemplate restTemplate;

    public UserService() {
        this.restTemplate = new RestTemplate();
    }

    public User getUser(String userId) {
        return this.restTemplate.getForEntity("http://localhost:8080/user/"+userId, User.class).getBody();
    }
    public Object[] getUsers() {
        String urlGETList = "http://localhost:8080/user/";
        ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(urlGETList, Object[].class);
        Object[] objects = responseEntity.getBody();
        MediaType contentType = responseEntity.getHeaders().getContentType();
        HttpStatus statusCode = responseEntity.getStatusCode();
       return objects;
    }

    public static void main(String[] args) {
        UserService userService=new UserService();
        Object[] objects = userService.getUsers();
        for(Object obj:objects){
            System.out.print(obj);

        }
    }
}
