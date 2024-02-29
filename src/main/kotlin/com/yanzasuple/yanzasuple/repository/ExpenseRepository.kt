package com.yanzasuple.yanzasuple.repository


import com.yanzasuple.yanzasuple.entity.Expense
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExpenseRepository: JpaRepository<Expense, Long?> {
}