package ru.wert.normypik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun quitApplication() = run {
        val sweetHome = Intent(Intent.ACTION_MAIN)
        sweetHome.addCategory(Intent.CATEGORY_HOME)
        startActivity(sweetHome)
        finishAndRemoveTask()
        java.lang.System.exit(0)
    }

}