package com.anna.healthyfoods.model.api

import com.google.gson.annotations.SerializedName


data class Hits (
  @SerializedName("recipe" ) var recipe : Recipe? = Recipe()
)