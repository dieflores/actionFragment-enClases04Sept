package com.example.ejemploenclases04sept

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)}}

     /*   // este valor se declara para poder inicializar
        // **  esteva con el de abajoval fragmentOne = FirstFragment()
        supportFragmentManager.beginTransaction()
            //**   aqui   .add(R.id.content_fragment, fragmentOne)
            .add(
                R.id.content_fragment,
                FirstFragment
                    .newInstance("FFFF", "TTTT")
            )
            .commit() */