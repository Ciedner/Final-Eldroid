package com.test.mabale_ciedner_final_project_sure

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityIntroBinding
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityMainBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.nextButton.setOnClickListener {
           goToDecisionActivity()
        }


    }

    private fun goToDecisionActivity() {
        val mainIntent = Intent(this, DecisionActivity::class.java)
        startActivity(mainIntent)
        finish()
    }
}