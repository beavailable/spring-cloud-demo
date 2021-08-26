package cn.test.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private int port;

    @GetMapping("{id}")
    public String name(@PathVariable Integer id) {
        if (id.equals(0)) {
            throw new RuntimeException("fallback");
        }
        return id + " " + port;
    }

}
