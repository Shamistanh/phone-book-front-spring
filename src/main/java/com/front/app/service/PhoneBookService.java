package com.front.app.service;

import com.front.app.client.XUserClient;
import lombok.RequiredArgsConstructor;
import com.front.app.model.XUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneBookService {
    private final XUserClient userClient;

    public List<XUser> fetchAllUsers(){
        return userClient.getAllUsers();
    }

}
