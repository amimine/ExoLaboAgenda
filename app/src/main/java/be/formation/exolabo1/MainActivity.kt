package be.formation.exolabo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

        //Initialisation tardive
        private lateinit var btnAddEvent : Button
        private lateinit var tvMeteo : TextView
        private lateinit var rvEvents : RecyclerView

    constructor(btnAddEvent: Button, tvMeteo: TextView, rvEvents: RecyclerView) {
        this.btnAddEvent = btnAddEvent
        this.tvMeteo = tvMeteo
        this.rvEvents = rvEvents
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Liaison avec le Layout
        btnAddEvent = findViewById(R.id.btn_add_event)
        tvMeteo = findViewById(R.id.tv_meteo)
        rvEvents = findViewById(R.id.rv_events)



    }

    fun addEvent() {

    }



}