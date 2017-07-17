package me.anilkc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableOAuth2Client
@EnableDiscoveryClient
public class UserServiceApp {

  public static void main(String[] args) {
    SpringApplication.run(UserServiceApp.class, args);
  }

}
