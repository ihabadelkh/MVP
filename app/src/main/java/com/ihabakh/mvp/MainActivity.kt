package com.ihabakh.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ihabakh.mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieInterface {
    private lateinit var binding: ActivityMainBinding
    private lateinit var moviePresenter: MoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        moviePresenter = MoviePresenter(this)
        binding.btnGetName.setOnClickListener {
            moviePresenter.getMovieName()
        }
    }

    override fun onGetMovieName(name: String) {
        binding.tvName.text = name
    }
}