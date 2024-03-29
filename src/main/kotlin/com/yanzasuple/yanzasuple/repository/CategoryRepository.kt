package com.yanzasuple.yanzasuple.repository

import com.yanzasuple.yanzasuple.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository: JpaRepository<Category, Long?> {
}

