package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextTextPersonName2.requestFocus()//thi created a focus on this edit section as cursor is on this section

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this,"checkbox is $isChecked",Toast.LENGTH_SHORT).show()
        }

        radioGroup.setOnCheckedChangeListener { Group, checkId ->
            when(checkId){
                R.id.radioButton1->{
                    Toast.makeText(this,"item is now button 1",Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton2->{
                    Toast.makeText(this,"item is now button 2",Toast.LENGTH_SHORT).show()
                }

            }

        }
    }
}