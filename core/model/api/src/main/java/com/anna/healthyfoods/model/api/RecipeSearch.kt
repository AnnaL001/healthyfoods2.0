package com.anna.healthyfoods.model.api

import com.anna.healthyfoods.model.api.Hits
import com.google.gson.annotations.SerializedName


data class RecipeSearch (
  @SerializedName("hits" ) var hits : ArrayList<Hits> = arrayListOf()
)