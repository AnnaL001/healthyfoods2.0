package com.anna.healthyfoods.model.api

import com.google.gson.annotations.SerializedName


data class THUMBNAIL (

  @SerializedName("url"    ) var url    : String? = null,
  @SerializedName("width"  ) var width  : Int?    = null,
  @SerializedName("height" ) var height : Int?    = null

)