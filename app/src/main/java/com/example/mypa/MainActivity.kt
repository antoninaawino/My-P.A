package com.example.mypa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mypa.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setOnclickListeners()
    }

    private fun setOnclickListeners() {
        try {
            binding.ltCreateTasks.setOnClickListener {
                startActivity(Intent(this, CreateTasksActivity::class.java))
            }
        } catch (e: Exception) {
            Log.e(TAG, "setOnclickListeners: ", e)
        }
    }
}