package org.integrational.sbkk

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloResource {

    @RequestMapping("/")
    fun hello() = HelloResponse("Hello World!")
}

data class HelloResponse(val message: String)