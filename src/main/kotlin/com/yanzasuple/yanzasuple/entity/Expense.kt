package com.yanzasuple.yanzasuple.entity

import jakarta.persistence.*
@Entity
@Table(name="expense")
class Expense {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var description: String? = null
    @Column(name = "category_id")
    var categoryId: String? = null
}


