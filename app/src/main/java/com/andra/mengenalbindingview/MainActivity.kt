package com.andra.mengenalbindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.andra.mengenalbindingview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)



        //1.  Kotlin Sytnthetic
        btnKotlinSynthetic.setOnClickListener{
            Log.d("Kotlin Synthetic", "Kotlin Synthetic telah diklik")
        }

        //2. Find View By Id
        val button: Button = findViewById(R.id.btnFindById)
        button.setOnClickListener {
            Log.d("Find View by Id", "Find View by Id telah diklik")
        }

        //3. Data binding
        binding.tvWelcome.text = "Welcome Bro!"


        //4. View Binding
        binding.btnViewBind.setOnClickListener {
            Log.d("View Binding","View Binding telah diklik")
        }
        
    }
}