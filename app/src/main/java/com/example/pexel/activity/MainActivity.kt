package com.example.pexel.activity

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.pexel.Home
import com.example.pexel.R
import com.example.pexel.photomanager.FeaturedPhotoManager
import com.example.pexel.SearchBar
import com.example.pexel.databinding.ActivityMainBinding
import com.example.pexel.photomanager.SearchPhotoManager


class MainActivity : AppCompatActivity() {


    private val word: String = "tree"
    private val perPage: Int = 3
    private val API_KEY: String = "6skVNRQlMtpQ0lboeOQHA48GLrroObY3pnMW8mYyoZsSnjn5syIoBKEU"

    private val searchBar: SearchBar = SearchBar()
//    private val home: Home = Home()

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val home = Home()
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
//        ft.replace(R.id.frame_layout, home).commit()

    }

    fun getSearched(){
        val sphm = SearchPhotoManager()
        sphm.fetchPhotos(API_KEY, word, perPage)
    }

    fun getImages(){
        val fphm: FeaturedPhotoManager = FeaturedPhotoManager()
        fphm.fetchFeatured(API_KEY, perPage)
    }
}