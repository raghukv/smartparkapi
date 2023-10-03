package com.smartpark.smartparkapi.controller

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
class TestController {

    @GetMapping("/test")
    fun getTest(): String{
        return "hello"
    }
}