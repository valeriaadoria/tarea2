package edu.iest.botoncalif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class aprobatorio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprobatorio)
        var califR= intent.getStringExtra("calif")
        Log.d("Datos","Datos recibidos con exito fueron calif $califR")

        var tvAprob = findViewById<TextView>(R.id.tvAprob)
        tvAprob.text = "Felicidades Aprobaste la materia con $califR"
    }
}