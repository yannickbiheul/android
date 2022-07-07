package com.example.findviewbyid

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHello = findViewById<TextView>(R.id.textViewHello)
        val editTextCava = findViewById<EditText>(R.id.editTextTextCava)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val buttonToast = findViewById<Button>(R.id.button)

        textViewHello.text = "Hello !"
        editTextCava.setText("Comment allez-vous ?!")
        ratingBar.rating = 3.0f
        buttonToast.setOnClickListener {
            Toast.makeText(this,
                "Je suis le toast :D Ouais trop bien !",
                Toast.LENGTH_SHORT).show()
            Snackbar.make(it, "Je suis une snackbar", Snackbar.LENGTH_SHORT).show()
        }
    }
}