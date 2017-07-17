package me.anilkc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayServiceApp {

  public static void main(String[] args) {
    SpringApplication.run(GatewayServiceApp.class, args);
  }
}
