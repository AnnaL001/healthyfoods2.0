package com.anna.healthyfoods.model.api

import com.google.gson.annotations.SerializedName


data class Ingredients (

  @SerializedName("text"         ) var text         : String? = null,
  @SerializedName("quantity"     ) var quantity     : Int?    = null,
  @SerializedName("measure"      ) var measure      : String? = null,
  @SerializedName("food"         ) var food         : String? = null,
  @SerializedName("weight"       ) var weight       : Int?    = null,
  @SerializedName("foodCategory" ) var foodCategory : String? = null,
  @SerializedName("foodId"       ) var foodId       : String? = null,
  @SerializedName("image"        ) var image        : String? = null

)