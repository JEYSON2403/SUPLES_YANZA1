package com.yanzasuple.yanzasuple.controller


import com.yanzasuple.yanzasuple.entity.Expense
import com.yanzasuple.yanzasuple.service.CategoryService
import com.yanzasuple.yanzasuple.service.ExpenseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/expense")   //endpoint
class ExpenseController {
    @Autowired
    lateinit var expenseService: ExpenseService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(expenseService.list(), HttpStatus.OK)
    }
    @PostMapping
    fun save (@RequestBody expense: Expense):ResponseEntity<Expense>{
        return ResponseEntity(expenseService.save(expense), HttpStatus.OK)
    }

}
