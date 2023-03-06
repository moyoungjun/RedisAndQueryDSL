package com.example.redispractice.controller

import com.example.redispractice.entity.redis
import com.example.redispractice.request.redisCrationRequest
import com.example.redispractice.response.redisResponse
import com.example.redispractice.service.RedisService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/redis")
@RestController
class RedisController(
    private val redisService: RedisService
) {

    @PostMapping
    fun test(@RequestBody redisCrationRequest: redisCrationRequest) {
        redisService.redisTest(redisCrationRequest)
    }

    @GetMapping
    fun gettest(): List<redisResponse> {
        val result = redisService.redisGetTest()
        return result
    }
}