package com.wotaggregatorbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class WotAggregatorBackendApplication

fun main(args: Array<String>) {
    runApplication<WotAggregatorBackendApplication>(*args)
}
