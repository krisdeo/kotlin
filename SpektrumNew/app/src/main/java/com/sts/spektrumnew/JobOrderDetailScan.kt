package com.sts.spektrumnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_job_order_detail.*
import kotlinx.android.synthetic.main.activity_job_order_detail_scan.*
import kotlinx.android.synthetic.main.activity_job_order_list.*

class JobOrderDetailScan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_order_detail_scan)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title

        actionbar!!.setDisplayHomeAsUpEnabled(true)

        toastSave()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    private fun toastSave() {
        ScanBarcodeButton.setOnClickListener {
            Toast.makeText(applicationContext, "Scan Barcode", Toast.LENGTH_SHORT).show()
        }
    }


}
