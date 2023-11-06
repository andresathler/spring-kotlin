package com.springkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CostumerController {

    @GetMapping
    fun helloWorld(): String {
        return "Hello World"
    }
}