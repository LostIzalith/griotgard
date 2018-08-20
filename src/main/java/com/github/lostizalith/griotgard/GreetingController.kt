package com.github.lostizalith.griotgard

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["greeting"])
class GreetingController {

    @GetMapping
    fun greeting(): ResponseEntity<String> =
            ResponseEntity.ok().body("Hello World")
}
