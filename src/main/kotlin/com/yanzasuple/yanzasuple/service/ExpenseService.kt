package com.yanzasuple.yanzasuple.service

import com.yanzasuple.yanzasuple.entity.Category
import com.yanzasuple.yanzasuple.entity.Expense
import com.yanzasuple.yanzasuple.repository.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class ExpenseService {
    @Autowired
    lateinit var expenseRepository: ExpenseRepository

    fun list(): List<Expense> {
        return expenseRepository.findAll()
    }

    fun save(expense: Expense): Expense {
        try {
            return expenseRepository.save(expense)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }

    }
}
