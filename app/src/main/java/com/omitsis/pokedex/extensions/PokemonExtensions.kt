package com.omitsis.pokedex.extensions

import android.content.Context
import android.widget.Toast
import com.omitsis.pokedex.model.Pokemon

fun Pokemon.id(): Int {

    try {
        val tokens = android.text.TextUtils.split(resourceUri, "/")
        val id =
                if (android.text.TextUtils.isEmpty(tokens[tokens.size - 1])) {
                    tokens[tokens.size - 2]
                } else {
                    tokens[tokens.size - 1]
                }
        return java.lang.Integer.parseInt(id)
    } catch (e: Exception) {
        return 0
    }


}

fun Context.myToast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}