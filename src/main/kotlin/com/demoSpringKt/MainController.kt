package com.demoSpringKt

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/kotlin/handbook")
class MainController{

    @Autowired
    lateinit var  article: ArticleRepository

    @GetMapping("/getAllArticle")
    fun getAllArticle() = article.findAll()

    @GetMapping("/getArticle")
    fun getArticle(@RequestParam id:Int) = article.findById(id)

}