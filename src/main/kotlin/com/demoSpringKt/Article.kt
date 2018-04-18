package com.demoSpringKt

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Article(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int? = 0,
        var name: String = " ",
        var text:String = ""
)