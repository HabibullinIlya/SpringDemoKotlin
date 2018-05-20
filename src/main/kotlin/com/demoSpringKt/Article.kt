package com.demoSpringKt

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Articles(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id_article: Int? = 0,
        var name_article: String = " ",
        var tags:String = " ",
        var article_text:String = ""
)