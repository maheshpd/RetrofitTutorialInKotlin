package com.createsapp.retrofittutorialinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.createsapp.retrofittutorialinkotlin.repository.Repository

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(
            this, viewModelFactory
        ).get(MainViewModel::class.java)
        viewModel.getPost()

        viewModel.myResponse.observe(this, Observer { response ->
            Log.d(TAG, "Response: "+response.userId.toString())
            Log.d(TAG, "Response: "+response.id.toString())
            Log.d(TAG, "Response: "+response.title)
            Log.d(TAG, "Response: "+response.body)
        })
    }
}