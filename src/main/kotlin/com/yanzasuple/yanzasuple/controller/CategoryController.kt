package com.yanzasuple.yanzasuple.controller

import com.yanzasuple.yanzasuple.entity.Category
import com.yanzasuple.yanzasuple.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/category")
class CategoryController {
    @Autowired
    lateinit var categoryService: CategoryService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(categoryService.list(), HttpStatus.OK)
    }
    @PostMapping
    fun save (@RequestBody category: Category):ResponseEntity<Category>{
        return ResponseEntity(categoryService.save(category), HttpStatus.OK)
    }

}