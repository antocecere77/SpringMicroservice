package com.appsdeveloperblog.photoapp.api.account.PhotoAppApiAccountManagement.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/status/chack")
    public String status() {
        return "Working...";
    }
}
