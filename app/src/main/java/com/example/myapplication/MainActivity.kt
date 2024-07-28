 package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class MainActivity : AppCompatActivity() , View.OnClickListener{
     lateinit var add_btn : Button
     lateinit var sub_btn : Button
     lateinit var mul_btn : Button
     lateinit var div_btn : Button
     lateinit var et_a: EditText
     lateinit var et_b: EditText
     lateinit var resultTV:TextView
     lateinit var oeTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add_btn=findViewById(R.id.add_btn)
        sub_btn=findViewById(R.id.sub_btn)
        mul_btn=findViewById(R.id.mul_btn)
        div_btn=findViewById(R.id.div_btn)
        et_a=findViewById(R.id.et_a)
        et_b=findViewById(R.id.et_b)
        resultTV=findViewById(R.id.resultTV)
        oeTV=findViewById(R.id.oeTV)
        add_btn.setOnClickListener(this)
        sub_btn.setOnClickListener(this)
        mul_btn.setOnClickListener(this)
        div_btn.setOnClickListener(this)

    }

     override fun onClick(v: View?) {
         var a=et_a.text.toString().toDouble()
         var b=et_b.text.toString().toDouble()
         var res=0.0
         when (v?.id){
             R.id.add_btn ->{
                 res=a+b
             }
             R.id.sub_btn ->{
                 res=a-b
             }
             R.id.mul_btn ->{
                 res=a*b
             }
             R.id.div_btn ->{
                 res=a/b
             }
         }
         resultTV.text=res.toString()
         if (res.rem(2)==0.0){
                 oeTV.text= getString(R.string.even)
             }
         else{
             oeTV.text= getString(R.string.odd)
         }
     }
 }