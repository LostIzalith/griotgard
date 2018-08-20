package com.github.lostizalith.griotgard

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GriotgardApplication

fun main(args: Array<String>) {
    SpringApplication.run(GriotgardApplication::class.java, *args)
}
