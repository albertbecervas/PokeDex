package com.omitsis.pokedex.model

import com.google.gson.annotations.SerializedName

data class Pokemon(@SerializedName("name") val name: String,
                   @SerializedName("resource_uri") val resourceUri: String,
                   @SerializedName("hp") val hp: String,
                   @SerializedName("attack") val attack: String,
                   @SerializedName("defense") val defense: String,
                   @SerializedName("height") val height: String,
                   @SerializedName("weight") val weight: String,
                   val image: String)
