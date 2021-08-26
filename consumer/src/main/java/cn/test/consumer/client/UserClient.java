package cn.test.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user", fallback = UserClient.UserClientFallback.class)
public interface UserClient {

    @GetMapping("{id}")
    String name(@PathVariable Integer id);

    @Component
    class UserClientFallback implements UserClient {

        @Override
        public String name(Integer id) {
            return "default name";
        }
    }
}
