package com.sts.spektrumnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_job_order_detail.*

class JobOrderDetail : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_order_detail)

        PanggilKolom1()
        PanggilKolom2()
        PanggilKolom3()
        PanggilKolom4()
        PanggilKolom5()

    }

    private fun PanggilKolom1(){
        tampilan1.setOnClickListener{
            startActivity(Intent(this,JobOrderList::class.java))
        }
    }

    private fun PanggilKolom2(){
        tampilan2.setOnClickListener{
            startActivity(Intent(this,JobOrderList::class.java))
        }
    }

    private fun PanggilKolom3(){
        tampilan3.setOnClickListener{
            startActivity(Intent(this,JobOrderList::class.java))
        }
    }

    private fun PanggilKolom4(){
        tampilan4.setOnClickListener{
            startActivity(Intent(this,JobOrderList::class.java))
        }
    }

    private fun PanggilKolom5(){
        tampilan5.setOnClickListener{
            startActivity(Intent(this,JobOrderList::class.java))
        }
    }
}
