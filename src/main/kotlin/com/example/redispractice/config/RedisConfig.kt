package com.example.redispractice.config

import com.example.redispractice.repository.RedisRepository
import org.springframework.boot.autoconfigure.data.redis.RedisProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@Configuration
@EnableRedisRepositories(basePackageClasses = [
    RedisRepository::class
])
class RedisConfig(
    private val redisProperties: RedisProperties
) {

    @Bean
    fun redisConnectionFactory(): RedisConnectionFactory {
        return LettuceConnectionFactory(redisProperties.host, redisProperties.port)
    }
}