package com.test.mabale_ciedner_final_project_sure

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.test.mabale_ciedner_final_project_sure.databinding.ActivityMoodInputBinding
import java.util.Date
import java.util.Locale

class MoodInputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoodInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoodInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val mood = binding.editMood.text.toString()
            val description = binding.editDescription.text.toString()

            // Display the mood and description in the TextView
            binding.textViewMoodDisplay.text = "Mood: \t$mood\nDescription: \t$description"
        }

        binding.backButton.setOnClickListener {
            goToMainActivity()
        }
    }
    private fun goToMainActivity() {
        val mainIntent = Intent(this, DecisionActivity::class.java)
        startActivity(mainIntent)
        finish()
    }

}