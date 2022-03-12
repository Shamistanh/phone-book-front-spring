package com.front.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.front.app.service.PhoneBookService;

@Log4j2
@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HomeController {

    private final PhoneBookService phoneBookService;

    @GetMapping("index")
    public String about(Model model) {
        log.info("getMapping -> /  (index)" + phoneBookService.fetchAllUsers() );
             model.addAttribute("members", phoneBookService.fetchAllUsers());
        return "index";
    }

    @GetMapping("status")
    public String status() {
        log.info("getStatus -> / service is up" );
        return "status";
    }

}
