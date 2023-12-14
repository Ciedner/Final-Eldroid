package com.test.mabale_ciedner_final_project_sure

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityHistoryBinding

class HistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backHistory.setOnClickListener {
            goToMainActivity()
        }
    }

    private fun goToMainActivity() {
        val mainIntent = Intent(this, DecisionActivity::class.java)
        startActivity(mainIntent)
        finish()
    }

}