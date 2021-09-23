package configuration;

import bean.MyBeanProperties;
import bean.MyBeanWitProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileUrlResource;
import pojo.UserPojo;

import java.net.MalformedURLException;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class DataConfiguration {



}
