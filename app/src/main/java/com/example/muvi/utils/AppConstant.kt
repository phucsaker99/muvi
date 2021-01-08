package com.example.muvi.utils

object ApiConfig {

    private const val BASE_URL_IMAGE = "https://image.tmdb.org/t/p/w500"
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val API_KEY = "api_key"

    fun getUrlImage(url: String?) = BASE_URL_IMAGE + url
}

object ApiEndPoint {
    const val PARAMS_ID = "id"
    const val PARAMS_PAGE = "page"
    const val PARAMS_GENRE_ID = "with_genres"
    const val GET_TRENDING_MOVIE = "trending/movie/day"
    const val GET_DISCOVERY_MOVIE =
        "discover/movie?sort_by=popularity.desc&year=2020&vote_average.gte=9&vote_average.lte=10"
    const val GET_TOP_RATE_MOVIE = "movie/top_rated"
    const val GET_POPULAR_MOVIE = "movie/popular"
    const val GET_RECOMMEND_MOVIE = "movie/{id}/recommendations"
    const val GET_VIDEO = "movie/{id}/videos"
    const val SEARCH_MULTI = "search/multi"
    const val GET_MOVIE_OF_ACTOR = "person/{id}/movie_credits"
    const val GET_ACTOR_OF_MOVIE = "movie/{id}/credits"
    const val GET_DETAIL_MOVIE = "movie/{id}"
}
