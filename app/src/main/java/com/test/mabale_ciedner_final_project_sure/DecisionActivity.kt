package com.test.mabale_ciedner_final_project_sure

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityDecisionBinding

class DecisionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDecisionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDecisionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddMood.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnViewHistory.setOnClickListener {
            // Assuming you have an Activity named HistoryActivity
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
    }
}