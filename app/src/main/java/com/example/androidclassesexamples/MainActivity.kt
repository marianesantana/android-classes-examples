package com.example.androidclassesexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.androidclassesexamples.databinding.ActivityMainBinding
import com.example.androidclassesexamples.databinding.CustomToastBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingToast: CustomToastBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        bindingToast = CustomToastBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnToast.setOnClickListener {
            Log.d("MainActivity", "Hello!")
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, bindingToast.clToast)
                show()
            }
        }




    }
}