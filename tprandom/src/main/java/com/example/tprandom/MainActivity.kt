package com.example.tprandom

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
//    On déclare les variables à l'avance (optionnel)
    lateinit var minimum : TextView
    lateinit var maximum : TextView
    lateinit var button : Button
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        minimum = findViewById<TextView>(R.id.minimum)
        maximum = findViewById<TextView>(R.id.maximum)
        button = findViewById<Button>(R.id.button)
        result = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
//            ".text" récupère un éditable, et non un string
            val mini :Int? = minimum.text.toString().toIntOrNull()
            val maxi :Int? = maximum.text.toString().toIntOrNull()
            if (mini != null && maxi != null) {
                if (mini < maxi) {
                    val resultat = Random.nextInt(mini, maxi)
//                    result.text = resultat.toString()
                    result.text = (mini..maxi).random().toString()
                } else {
                    Snackbar.make(it,
                        "Le minimum est plus grand que le maximum, IDIOT !",
                        Snackbar.LENGTH_SHORT).show()
                    minimum.text = ""
                    maximum.text = ""
//                finish();
//                startActivity(getIntent());
                }
            }


        }
    }
}