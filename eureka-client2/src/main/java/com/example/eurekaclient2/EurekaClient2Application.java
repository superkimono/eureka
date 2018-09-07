package com.example.eurekaclient2;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClient2Application {

    @Autowired
    @Qualifier("eurekaClient")
    private EurekaClient eurekaClient;

    @GetMapping("/serviceinfo")
    public String service() {
        InstanceInfo info = eurekaClient.getNextServerFromEureka("firstClient", false);
        return info.getHomePageUrl() + info.isDirty();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }
}
