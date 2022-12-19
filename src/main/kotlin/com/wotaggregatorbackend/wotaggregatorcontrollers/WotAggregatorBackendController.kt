package com.wotaggregatorbackend.wotaggregatorcontrollers

import org.springframework.beans.factory.annotation.Value
import org.springframework.data.annotation.Id
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource() {

    @Value("\${wotapis.endpoints.searchplayer}")
    lateinit var url: String

    @GetMapping("/")
    fun index(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
        Message("get player id ", url),
    )
}
data class Message(val id: String?, val text: String)