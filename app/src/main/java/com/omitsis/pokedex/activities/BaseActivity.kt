package com.omitsis.pokedex.activities

import android.app.ProgressDialog
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.omitsis.pokedex.R
import com.omitsis.pokedex.dagger.setup.components.AppComponent
import com.omitsis.pokedex.mvp.view.BaseView

abstract class BaseActivity : AppCompatActivity(), BaseView {

    abstract fun getActivityLayout(): Int

    abstract fun injectDependencies(appComponent : AppComponent)

    var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }

    private fun initProgressDialog() {
        progressDialog = ProgressDialog(this)
        progressDialog?.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        progressDialog?.setMessage(getString(R.string.please_wait))
    }

    override fun showProgress() {
        progressDialog?.show();
    }

    override fun hideProgress() {
        progressDialog?.hide();
    }

    override fun showMessage(message: String) {


    }

}