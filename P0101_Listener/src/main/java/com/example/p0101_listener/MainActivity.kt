package com.example.p0101_listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    TextView tvOut
    Button btnOk
    Button btnCancel

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut)
        btnOk = (Button) findViewById(R.id.btnOk)
        btnCancel = (Button) findViewById(R.id.btnCancel)

        // создание обработчика
        View.OnClickListener oclBtn = new View.OnClickListener {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

            }
        }

    }
}
