package com.example.kotlinPGj.api.test.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import javax.print.attribute.IntegerSyntax

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): String {
        var name: String = "테스트";
        return name
    }

}