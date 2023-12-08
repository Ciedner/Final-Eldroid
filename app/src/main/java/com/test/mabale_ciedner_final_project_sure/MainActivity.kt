package com.test.mabale_ciedner_final_project_sure

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSkip.setOnClickListener {
            finish()
        }

        binding.btnNext.setOnClickListener {
            Toast.makeText(this, "Next button clicked", Toast.LENGTH_SHORT).show()

        }

    }
}
