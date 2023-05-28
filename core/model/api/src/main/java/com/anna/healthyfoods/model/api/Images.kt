package com.anna.healthyfoods.model.api

import com.google.gson.annotations.SerializedName


data class Images (

  @SerializedName("THUMBNAIL" ) var THUMBNAIL : THUMBNAIL? = THUMBNAIL(),
  @SerializedName("SMALL"     ) var SMALL     : SMALL?     = SMALL(),
  @SerializedName("REGULAR"   ) var REGULAR   : REGULAR?   = REGULAR()

)