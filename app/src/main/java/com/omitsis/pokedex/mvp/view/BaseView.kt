package com.omitsis.pokedex.mvp.view

interface BaseView {

    fun showProgress()

    fun hideProgress()

    fun showMessage(message: String)

}