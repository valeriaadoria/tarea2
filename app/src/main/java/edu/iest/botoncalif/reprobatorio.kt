package edu.iest.botoncalif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class reprobatorio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reprobatorio)
        var califR= intent.getStringExtra("calif")
        Log.d("Datos","Datos recibidos con exito fueron calif $califR")

        var bnRegresar= findViewById<Button>(R.id.bnRegresar)
        bnRegresar.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

        var tvReprob = findViewById<TextView>(R.id.tvReprob)
        tvReprob.text = "Obtuviste un $califR :("

    }
}