package com.example.tp1ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var android:CheckBox
    lateinit var microsoft: CheckBox
    lateinit var afficher:Button
    lateinit var radioGroup: RadioGroup
    lateinit var dsi:RadioButton
    lateinit var rsi:RadioButton
    lateinit var sem:RadioButton
    fun init() {
        android = findViewById(R.id.Android);
        microsoft = findViewById(R.id.Microsoft);
        afficher = findViewById(R.id.afficher);
        radioGroup = findViewById(R.id.radioGroup);
        dsi = findViewById(R.id.DSI);
        rsi = findViewById(R.id.RSI);
        sem = findViewById(R.id.SEM);
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.init();
        afficher.setOnClickListener {
            var specialite = "Specialité ";
            var club = "Club :";
            if (android.isChecked){
                club += "android";
            }
            if (microsoft.isChecked) {
                club += " microsoft";
            }
            if(!dsi.isChecked && !rsi.isChecked && !sem.isChecked){
                Toast.makeText(applicationContext,"Vous devez choisir une specialité",Toast.LENGTH_LONG).show();
            }
            else if (radioGroup.checkedRadioButtonId == R.id.SEM) {
                specialite += "SEM";
            }else if(radioGroup.checkedRadioButtonId == R.id.DSI) {
                specialite += "DSI";
            }else if(radioGroup.checkedRadioButtonId == R.id.RSI) {
                specialite += "RSI"
            }
            var message = specialite + " " + club;
            Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show();



        }
    }
}