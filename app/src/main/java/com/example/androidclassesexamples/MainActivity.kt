package com.example.androidclassesexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.androidclassesexamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)




        binding.btnOrder.setOnClickListener{
            var rgChecketMeatId = binding.rgMeat.checkedRadioButtonId
            var meat = findViewById<RadioButton>(rgChecketMeatId)

            var cheese = binding.cbCheese.isChecked
            var salad = binding.cbSalad.isChecked
            var onions = binding.cbOnions.isChecked

            var stringOrder = "Your order is: \n" +
                    "${meat.text}, ${ if(cheese) "Cheese" else ""}" +
                    "${if(salad) "Salad" else ""}" +
                    "${if(onions) "Onions" else ""}"

            binding.txtOrder.text = stringOrder
        }


    }
}