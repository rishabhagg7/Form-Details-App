package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.databinding.ActivityMainBinding
const val KEY_1 = "Name"
const val KEY_2 = "Age"
const val KEY_3 = "isStudent"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val editText = binding.editText
        val editText1 = binding.editText1
        val btn = binding.btn
        val checkBox = binding.checkBox
        btn.setOnClickListener {
            val i = Intent(this,Main2Activity::class.java)
            i.putExtra(KEY_1,editText.text.toString()) //sending a value of string to other activity
            if(editText1.text.toString().isEmpty()){
                i.putExtra(KEY_2,0)
            }else{
                i.putExtra(KEY_2,editText1.text.toString().toInt())
            }
            i.putExtra(KEY_3, checkBox.isChecked.toString().toBoolean())
            startActivity(i)
        }
    }
}