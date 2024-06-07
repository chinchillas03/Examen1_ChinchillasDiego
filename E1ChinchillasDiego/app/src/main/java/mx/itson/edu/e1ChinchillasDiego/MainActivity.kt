package mx.itson.edu.e1ChinchillasDiego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val precio_original : EditText = findViewById(R.id.precio_original)
        val desc10 : Button = findViewById(R.id.desc10)
        val desc15 : Button = findViewById(R.id.desc15)
        val desc20 : Button = findViewById(R.id.desc20)
        val desc25 : Button = findViewById(R.id.desc25)
        val desc30 : Button = findViewById(R.id.desc30)
        val desc40 : Button = findViewById(R.id.desc40)
        val porcentaje : TextView = findViewById(R.id.porcentaje)
        val total_text : TextView = findViewById(R.id.total_text)
        val button_tip : Button = findViewById(R.id.button_tip)
        val button_discount : Button = findViewById(R.id.button_discount)

        var stringPorcent : String = ""
        var porcent : Double
        desc10.setOnClickListener{
            porcent = calcularPorcentaje("10", precio_original.text.toString().toDouble())
            stringPorcent = porcent.toString()
            porcentaje.setText(stringPorcent)
        }

        desc15.setOnClickListener{
            porcent = calcularPorcentaje("15", precio_original.text.toString().toDouble())
            stringPorcent = porcent.toString()
            porcentaje.setText(stringPorcent)
        }

        desc20.setOnClickListener{
            porcent = calcularPorcentaje("20", precio_original.text.toString().toDouble())
            stringPorcent = porcent.toString()
            porcentaje.setText(stringPorcent)
        }

        desc25.setOnClickListener{
            porcent = calcularPorcentaje("25", precio_original.text.toString().toDouble())
            stringPorcent = porcent.toString()
            porcentaje.setText(stringPorcent)
        }

        desc30.setOnClickListener{
            porcent = calcularPorcentaje("30", precio_original.text.toString().toDouble())
            stringPorcent = porcent.toString()
            porcentaje.setText(stringPorcent)
        }

        desc40.setOnClickListener{
            porcent = calcularPorcentaje("40", precio_original.text.toString().toDouble())
            stringPorcent = porcent.toString()
            porcentaje.setText(stringPorcent)
        }

        button_tip.setOnClickListener {
            val restul = sumar(precio_original.text.toString().toDouble(), porcentaje.text.toString().toDouble())
            total_text.setText(restul)
        }

        button_discount.setOnClickListener {
            val restul = restar(precio_original.text.toString().toDouble(), porcentaje.text.toString().toDouble())
            total_text.setText(restul)
        }

    }

    fun sumar (original : Double, porcentaje : Double): String {
        val total = original + porcentaje
        return total.toString()
    }

    fun restar (original : Double, porcentaje : Double): String {
        val total = original - porcentaje
        return total.toString()
    }

    fun calcularPorcentaje(porcentaje : String, total : Double): Double {
        var porcentajeCalculado : Double = 0.0
        if (porcentaje == "10"){
            porcentajeCalculado = total * 0.10
        } else if (porcentaje == "15"){
            porcentajeCalculado = total * 0.15
        } else if (porcentaje == "20"){
            porcentajeCalculado = total * 0.20
        } else if (porcentaje == "25"){
            porcentajeCalculado = total * 0.25
        } else if (porcentaje == "30"){
            porcentajeCalculado = total * 0.30
        } else if (porcentaje == "40"){
            porcentajeCalculado = total * 0.40
        }
        return porcentajeCalculado
    }

}