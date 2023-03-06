package com.example.redispractice.repository

import com.example.redispractice.entity.redis
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RedisRepository: CrudRepository<redis, Long> {
}