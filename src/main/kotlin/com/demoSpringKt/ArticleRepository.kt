package com.demoSpringKt

import org.springframework.data.repository.CrudRepository

interface ArticleRepository: CrudRepository<Article, Int?> {
}