package com.anna.healthyfoods.model.api

import com.google.gson.annotations.SerializedName


data class Recipe (

  @SerializedName("uri"            ) var uri            : String?                = null,
  @SerializedName("label"          ) var label          : String?                = null,
  @SerializedName("image"          ) var image          : String?                = null,
  @SerializedName("images"         ) var images         : Images?                = Images(),
  @SerializedName("source"         ) var source         : String?                = null,
  @SerializedName("url"            ) var url            : String?                = null,
  @SerializedName("yield"          ) var yield          : Int?                   = null,
  @SerializedName("dietLabels"     ) var dietLabels     : ArrayList<String>      = arrayListOf(),
  @SerializedName("healthLabels"   ) var healthLabels   : ArrayList<String>      = arrayListOf(),
  @SerializedName("cautions"       ) var cautions       : ArrayList<String>      = arrayListOf(),
  @SerializedName("ingredients"    ) var ingredients    : ArrayList<Ingredients> = arrayListOf(),
  @SerializedName("calories"       ) var calories       : Double?                = null,
  @SerializedName("totalWeight"    ) var totalWeight    : Double?                = null,
  @SerializedName("totalTime"      ) var totalTime      : Int?                   = null,
  @SerializedName("cuisineType"    ) var cuisineType    : ArrayList<String>      = arrayListOf(),
  @SerializedName("mealType"       ) var mealType       : ArrayList<String>      = arrayListOf(),
  @SerializedName("dishType"       ) var dishType       : ArrayList<String>      = arrayListOf(),
  @SerializedName("totalNutrients" ) var totalNutrients : TotalNutrients?        = TotalNutrients()

)