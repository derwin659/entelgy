package controller;


import entity.Data;
import org.hibernate.dialect.identity.JDataStoreIdentityColumnSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pojo.UserPojo;


import java.util.*;

@RestController

public class ConsumeWebService {


private static UserPojo userPojo;
private   String LINK_USERS=userPojo.getUrl();

 @Autowired
  static  RestTemplate restTemplate=new RestTemplate();

    public ConsumeWebService(UserPojo userPojo) {
        this.userPojo = userPojo;
    }

    public ConsumeWebService() {

    }

    public static void main(String[] args){
            callGetAllUserAPI();


        }

        @RequestMapping (value="/user")
        public static Object callGetAllUserAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<String> result =restTemplate.exchange("https://reqres.in/api/users",HttpMethod.GET,entity,String.class);

         List list=java.util.Arrays.asList(result.toString());

         list.stream()
                 .filter(valor->valor.equals(valor))
                         .forEach(System.out::println);


      return list;
        }





    }







