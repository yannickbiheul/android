package com.example.punkapi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import java.io.IOException

// logt
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client = OkHttpClient()
        val request = Request.Builder().url("https://api.punkapi.com/v2/beers/random").build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e(TAG, "onFailure: $e")
            }

            override fun onResponse(call: Call, response: Response) {
                Log.i(TAG, "onResponse: ${response.body?.string()}")
            }
        })
    }
}