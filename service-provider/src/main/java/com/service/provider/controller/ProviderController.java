package com.service.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jwh
 */
@RestController
public class ProviderController {

    @RequestMapping("/test")
    public String test(){
        return "11111111";
    }
}
