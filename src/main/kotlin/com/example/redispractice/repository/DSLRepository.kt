package com.example.redispractice.repository

import com.example.redispractice.entity.DSLTest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface DSLRepository : JpaRepository<DSLTest, Long>, DSLCustomRepository {

}