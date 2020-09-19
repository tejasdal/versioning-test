package org.dal.tejas.versioningtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

    @GetMapping("/test")
    public String versionTestOne(){
        return "Hello Version Test One!";
    }
}
