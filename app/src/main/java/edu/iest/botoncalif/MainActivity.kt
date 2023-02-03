package edu.iest.botoncalif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var etCalif : EditText
    private lateinit var tvCalif : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etCalif = findViewById(R.id.etCalif)
        tvCalif = findViewById(R.id.tvCalif)

        var bnEnviar = findViewById<Button>(R.id.bnEnviar)
        bnEnviar.setOnClickListener{
            val calif = etCalif.text.toString().toFloat()
            if (calif in 7.0..10.0){
            val i = Intent(this, aprobatorio::class.java)
            i.putExtra("calif", etCalif.text.toString())
            startActivity(i)
            }else if (calif in 0.0..6.9){
                val i = Intent(this, reprobatorio::class.java)
                Snackbar.make(tvCalif, "Su frase fue $calif", Snackbar.LENGTH_LONG).show()
                i.putExtra("calif", etCalif.text.toString())
                startActivity(i)
            }else{
                Snackbar.make(tvCalif, "$calif no es un numero valido. Ingrese una calificacion del 0 al 10", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}

