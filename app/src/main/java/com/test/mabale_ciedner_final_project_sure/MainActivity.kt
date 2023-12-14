package com.test.mabale_ciedner_final_project_sure

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityIntroBinding
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener {
            // Open MoodInputActivity when the "Next" button is clicked
            val intent = Intent(this, MoodInputActivity::class.java)
            startActivity(intent)
        }

    }
}
