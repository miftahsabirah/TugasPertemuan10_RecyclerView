package com.example.tugaspertemuan10_recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugaspertemuan10_recycleview.databinding.ActivityDetailMovieBinding
import com.example.tugaspertemuan10_recycleview.databinding.ActivityMainBinding
import com.example.tugaspertemuan10_recycleview.databinding.ItemMovieBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieAdapter = MovieAdapter(generateDummy()){movie ->
            val intent = Intent(this@MainActivity, detailMovie::class.java)
            startActivity(intent)
        }



        with(binding){
            recyclerView.apply {
                adapter = movieAdapter
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }

    }

    private fun generateDummy(): List<Movie> {

        return listOf(
            Movie("Brave", "Film ini berlangsung di Skotlandia abad ke-10", R.drawable.film1),
            Movie("Encanto", "Encanto menceritakan kisah keluarga yang bernama Madrigal, yang tinggal di kota ajaib di pegunungan Kolombia", R.drawable.film2),
            Movie("Turning Red", "Berlatar di Toronto, Kanada  tahun 2002, Meilin Mei Lee adalah seorang anak muda berusia 13 tahun yang berprestasi", R.drawable.film3),
            Movie("Frozen", "Frozen adalah film animasi komputer 3D bergenre musikal fantasi yang diproduksi dan didistribusikan oleh Walt Disney", R.drawable.film4),

            )

    }


}