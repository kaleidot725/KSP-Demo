package com.example.demo.model

import com.example.annotation.AutoBuilder

@AutoBuilder(flexible = true)
data class Person(
    val name: String,
    val age: Int?,
    val email: String?,
    val contact: Pair<String, String>?
)