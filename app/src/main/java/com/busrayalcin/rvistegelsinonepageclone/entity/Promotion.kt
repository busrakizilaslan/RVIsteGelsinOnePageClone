package com.busrayalcin.rvistegelsinonepageclone.entity

import java.io.Serializable

data class Promotion(
    var promotionId: Int,
    var promotionImg: String,
    var promotionName: String) : Serializable{
}