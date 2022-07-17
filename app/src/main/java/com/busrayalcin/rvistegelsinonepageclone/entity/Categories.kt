package com.busrayalcin.rvistegelsinonepageclone.entity

import java.io.Serializable

data class Categories(
    var categoryId: Int,
    var categoryImg: String,
    var categoryName: String) : Serializable {
}