package com.example.redispractice.service

import com.example.redispractice.entity.redis
import com.example.redispractice.repository.RedisRepository
import com.example.redispractice.request.redisCrationRequest
import com.example.redispractice.response.redisResponse
import org.springframework.stereotype.Service

@Service
class RedisService(
    private val redisRepository: RedisRepository
) {
    fun redisTest(redisCrationRequest: redisCrationRequest) {
        val redis = redis(redisCrationRequest)
        redisRepository.save(redis)
    }

    fun redisGetTest(): List<redisResponse> {
        val redis = redisRepository.findAll().map { redisResponse(it.id, it.values) }
        return redis
    }
}