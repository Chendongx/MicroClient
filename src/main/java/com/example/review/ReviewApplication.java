package com.example.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/*import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;*/

//@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement  //开启事务管理
public class ReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewApplication.class, args);
    }

    //@LoadBalanced就能让这个RestTemplate在请求时拥有客户端负载均衡的能力
    /*@Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }*/
}
