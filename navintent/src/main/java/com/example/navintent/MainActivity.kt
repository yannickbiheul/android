package com.example.navintent

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.PermissionChecker.PERMISSION_GRANTED

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Intent explicite (destination connue)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intentToTarget = Intent(this, targetActivity::class.java)
            intentToTarget.putExtra("age", 40)
            startActivity(intentToTarget)
        }

        // Intent implicite (destination inconnue)
        val buttonCall = findViewById<Button>(R.id.buttonCall)
        buttonCall.setOnClickListener {
            val uri = Uri.parse("tel:0612345678")
            val intentToCall = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intentToCall)
        }

        val buttonEnvoiSms = findViewById<Button>(R.id.buttonEnvoiSms)
        buttonEnvoiSms.setOnClickListener {
            ActivityCompat.requestPermissions(this,arrayOf(Manifest.permission.SEND_SMS),21)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 21 && grantResults[0] == PERMISSION_GRANTED) {
            val intentToSms = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:0612345678"))
            intentToSms.putExtra("sms_body","Bonjour voici un sms.")
            startActivity(intentToSms)
        }
    }
}