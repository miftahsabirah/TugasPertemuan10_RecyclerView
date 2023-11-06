package com.example.tugaspertemuan10_recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaspertemuan10_recycleview.databinding.ItemMovieBinding


typealias onClickMovie = (Movie) -> Unit

    class MovieAdapter (private val listMovie: List<Movie>,
                           private val onClickMovie : onClickMovie):
        RecyclerView.Adapter<MovieAdapter.ItemMovieViewHolder>(){
        inner class ItemMovieViewHolder(private val binding :
           ItemMovieBinding) : RecyclerView.ViewHolder(binding.root){
            fun bind (data : Movie){
                with(binding){
                    movieTitle.text = data.nameMovie
                    movieDesc.text = data.descMovie

                    val image_movie = when (data.imageMovie){
                        R.drawable.film1 -> R.drawable.film1
                        R.drawable.film2 -> R.drawable.film2
                        R.drawable.film3 -> R.drawable.film3
                        else -> R.drawable.film4
                    }

                    imageMovie.setImageResource(image_movie)
                    itemView.setOnClickListener{
                        onClickMovie(data)
                    }
                }
            }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMovieViewHolder {
            val binding = ItemMovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false)
            return ItemMovieViewHolder(binding)
        }

        override fun getItemCount(): Int =listMovie.size

        override fun onBindViewHolder(holder: ItemMovieViewHolder, position: Int) {
            holder.bind(listMovie[position])
        }
    }
