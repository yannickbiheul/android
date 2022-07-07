package com.example.tpvraifaux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    VARIABLES
    lateinit var binding : ActivityMainBinding
    var index = 0
    var score = 0
    var questions = arrayListOf<QuestionReponse>(
        QuestionReponse("Est-ce vrai ?", false),
        QuestionReponse("Quel temps fera t'il demain ?", false),
        QuestionReponse("Dick Rivers ?", true),
        QuestionReponse("La mer est bleue ?", true),
        QuestionReponse("L-herbe est verte ?", true)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.qr = questions[index]
        showScore()

        binding.buttonVrai.setOnClickListener {
            checkUserResponse(true)
        }
        binding.buttonFaux.setOnClickListener {
            checkUserResponse(false)
        }
    }

    fun checkUserResponse(responseUser: Boolean) {
        if (index > questions.size-1) return
        if (responseUser == questions[index].reponse) {
            score++
            showScore()
        }
        if (++index <= (questions.size-1)) {
            binding.qr = questions[index]
        }
    }

    fun showScore() {
        binding.textViewScore.text = "${score.toString()}/${questions.size}"
    }

}