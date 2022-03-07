package com.front.app.client;

import com.front.app.model.XUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "PhoneBookClient", url = "${phonebook.client.link}", configuration = FeignConf.class)
public interface XUserClient {

    @GetMapping("/user/list")
    List<XUser> getAllUsers();
}
