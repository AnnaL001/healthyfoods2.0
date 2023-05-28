package com.anna.healthyfoods.model.api

import com.google.gson.annotations.SerializedName


data class FATRN (

  @SerializedName("label"    ) var label    : String? = null,
  @SerializedName("quantity" ) var quantity : Int?    = null,
  @SerializedName("unit"     ) var unit     : String? = null

)