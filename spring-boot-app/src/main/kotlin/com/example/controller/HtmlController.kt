package com.example.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController {
    @Value("\${spring.application.name}")
    var appName: String? = null

    @GetMapping("/")
    fun homePage(model: Model): String {
        return "Name of this App is :>  " + appName.toString()
    }
}