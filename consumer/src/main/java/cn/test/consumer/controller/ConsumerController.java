package cn.test.consumer.controller;

import cn.test.consumer.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    // private RestTemplate restTemplate;
    private UserClient userClient;

    @GetMapping("{id}")
    public String name(@PathVariable Integer id) {
        // return restTemplate.getForObject("http://user/{id}", String.class, id);
        return userClient.name(id);
    }
}
