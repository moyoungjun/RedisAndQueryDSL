package com.example.redispractice.entity

import com.example.redispractice.request.redisCrationRequest
import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType


@RedisHash("redis")
class redis(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val values: String
) {
    constructor(redisCreationRequest: redisCrationRequest) : this(
        id = redisCreationRequest.id,
        values = redisCreationRequest.value
    )
}