package com.retobackend.entelgy;




import bean.MyBeanWitProperties;
import net.sf.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileUrlResource;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;

@SpringBootApplication
public class EntelgyApplication{





	public static void main(String[] args) {
		SpringApplication.run(EntelgyApplication.class, args);
	}





}