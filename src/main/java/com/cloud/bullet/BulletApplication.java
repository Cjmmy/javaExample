package com.cloud.bullet;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;

@SpringBootApplication
@EnableDiscoveryClient
public class BulletApplication {

    public static void main(String[] args) {
        SpringApplication.run(BulletApplication.class, args);
        //CloseableHttpClient client = HttpClients.createDefault();
        //HttpGet httpGet = new HttpGet("http://localhost:8080/invoke?serviceName=USER&param=show");
        //try {
        //    CloseableHttpResponse response = client.execute(httpGet);
        //
        //    if(response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
        //        String result = EntityUtils.toString(response.getEntity());
        //        System.out.println(result);
        //    }
        //
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
    }

}
