package com.daofu.demo.controller;

import com.daofu.demo.entity.ContactMessage;
import com.daofu.demo.service.ContactService;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autwired
    private ContactService contactService;

    @PostMapping
    public void submitContactForm(@RequestBody ContactMessage contactMessage){

        // 使用redis 做限流
        // 使用redis key = email 防止重复提交
        contactService.submitContactForm(contactMessage);
    }
}
