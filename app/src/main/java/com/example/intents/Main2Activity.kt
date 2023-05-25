package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {
    private lateinit var binding2:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        val view2 = binding2.root
        setContentView(view2)
        val name = intent.getStringExtra(KEY_1)
        val textView = binding2.textView
        textView.text = "Hello $name!"

        val age = intent.getIntExtra(KEY_2,0)
        val isStudent = intent.getBooleanExtra(KEY_3,false)
        val textView1 = binding2.textView1
        textView1.text = "You are $age years old!"

        val textView2 = binding2.textView2
        if(isStudent){
            textView2.text = "You are a student! Be motivated"
        }else{
            textView2.text = "You are not a student! Keep motivating others!"
        }

    }
}