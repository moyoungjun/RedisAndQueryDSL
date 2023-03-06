package com.example.redispractice.controller

import com.example.redispractice.repository.DSLCustomRepository
import com.example.redispractice.repository.DSLCustomRepositoryImpl
import com.example.redispractice.repository.DSLRepository
import com.example.redispractice.response.dslResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DSLTestController(
    private val dslRepository: DSLRepository
) {
    @GetMapping("/dsl")
    fun getTest(): List<dslResponse> {
        return dslRepository.findAllByDsl().map { dslResponse(it.id!!, it.title, it.content) }
    }
}