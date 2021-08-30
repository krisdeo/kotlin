package com.sts.spektrumnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_job_order_detail_scan.*
import kotlinx.android.synthetic.main.activity_job_order_list.*

class JobOrderList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_order_list)


        //actionbar
        val actionbar = supportActionBar
        //set actionbar title

        //set back button
        actionbar!!.setDisplayHomeAsUpEnabled(true)

        toastSave()
        PanggilButtonSave()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun PanggilButtonSave(){
        SaveButtonOrderList.setOnClickListener{
            startActivity(Intent(this,JobOrderDetailScan::class.java))
        }
    }

    private fun toastSave() {
        StartButtonOrderList1.setOnClickListener {
            Toast.makeText(applicationContext, "Start", Toast.LENGTH_SHORT).show()
        }

        StartButtonOrderList2.setOnClickListener {
            Toast.makeText(applicationContext, "Start", Toast.LENGTH_SHORT).show()
        }
    }
}
