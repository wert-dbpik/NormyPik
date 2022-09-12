package ru.wert.normypik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import ru.wert.normypik.materials.MaterialsActivity
import ru.wert.normypik.time_norms.TimeNormsActivity

class StartActivity : BaseActivity() {

    private lateinit var mTimeNorms: Button;
    private lateinit var mMaterialConsumption: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        mTimeNorms = findViewById(R.id.btnTimeNorms)
        mTimeNorms.setOnClickListener(){
            val openTimeNormsCalculation= Intent(this, TimeNormsActivity::class.java)
            startActivity(openTimeNormsCalculation)
        }

        mMaterialConsumption = findViewById(R.id.btnMaterialConsumption)
        mMaterialConsumption.setOnClickListener(){
            val openMaterialsCalculation= Intent(this, MaterialsActivity::class.java)
            startActivity(openMaterialsCalculation)
        }

    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Хотите закрыть прилоение?")
            .setPositiveButton("Да") { dialog, id ->
                quitApplication()
            }
            .setNegativeButton("Нет") { dialog, id ->
                dialog.dismiss()
            }
            .create().show()

    }

}