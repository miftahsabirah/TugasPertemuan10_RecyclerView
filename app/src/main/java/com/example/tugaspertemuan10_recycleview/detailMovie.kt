package com.example.tugaspertemuan10_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaspertemuan10_recycleview.databinding.ActivityDetailMovieBinding

class detailMovie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            tombolBack.setOnClickListener {
                finish()
            }
        }
    }
}