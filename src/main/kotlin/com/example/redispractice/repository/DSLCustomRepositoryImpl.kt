package com.example.redispractice.repository

import com.example.redispractice.entity.DSLTest
import com.example.redispractice.entity.QDSLTest.dSLTest
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository


@Repository
class DSLCustomRepositoryImpl(
    val queryFactory: JPAQueryFactory
): DSLCustomRepository {
    override fun findAllByDsl(): MutableList<DSLTest> {
        return queryFactory
            .select(
                Projections.fields(
                    DSLTest::class.java,
                    dSLTest.id,
                    dSLTest.title,
                    dSLTest.content
                )
            )
            .from(dSLTest)
            .fetch()
    }
}