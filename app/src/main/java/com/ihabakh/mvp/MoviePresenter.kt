package com.ihabakh.mvp

class MoviePresenter(movieInterface: MovieInterface) {

    private var movieInterface: MovieInterface

    init {
        this.movieInterface = movieInterface
    }

    private fun getMovieNameFromData(): MovieModel {
        return MovieModel("Underworld")
    }

    fun getMovieName() {
        movieInterface.onGetMovieName(getMovieNameFromData().name)
    }
}