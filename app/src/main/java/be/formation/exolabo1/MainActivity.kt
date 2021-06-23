package be.formation.exolabo1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

        //Initialisation tardive
        private lateinit var btnAddEvent : Button
        private lateinit var tvMeteo : TextView
        private lateinit var rvEvents : RecyclerView
        private lateinit var btnPrevision : Button
        private lateinit var btnEditEvent : Button
        private lateinit var btnDeleteEvent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Liaison avec le Layout

        btnAddEvent = findViewById(R.id.btn_add_event)
        tvMeteo = findViewById(R.id.tv_meteo)
        rvEvents = findViewById(R.id.rv_events)
        btnPrevision = findViewById(R.id.btn_prevision)
        btnEditEvent = findViewById(R.id.btn_edit_event)
        btnDeleteEvent = findViewById(R.id.btn_delete_event)

        btnAddEvent.setOnClickListener(View.OnClickListener {it
            (R.id.cv_agenda)


        })
        btnEditEvent.setOnClickListener(View.OnClickListener {it
            (R.id.rv_events)
        })

        btnDeleteEvent.setOnClickListener(View.OnClickListener {it
            (R.id.rv_events)
        })

        btnPrevision.setOnClickListener((View.OnClickListener { it
            (R.id.tv_prevision)
        }))
    }

    };