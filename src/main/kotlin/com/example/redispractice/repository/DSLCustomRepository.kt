package com.example.redispractice.repository

import com.example.redispractice.entity.DSLTest

interface DSLCustomRepository {
    fun findAllByDsl(): MutableList<DSLTest>
}