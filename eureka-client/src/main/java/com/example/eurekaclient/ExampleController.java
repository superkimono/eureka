package com.example.eurekaclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExampleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/execute")
    public String execute() {
        return restTemplate.getForObject("http://secondService/serviceinfo", String.class);
    }

    @GetMapping("/execute1")
    public String execute1() {
        return restTemplate.getForObject("http://secondService/serviceinfo1", String.class);
    }
}
