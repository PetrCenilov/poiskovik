package com.example.poiskovik

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickToast1(view: View) {
        Toast.makeText(this,"Меню",Toast.LENGTH_SHORT).show()
    }

    fun onClickToast2(view: View) {
        Toast.makeText(this,"Избранное",Toast.LENGTH_SHORT).show()
    }

    fun onClickToast3(view: View) {
        Toast.makeText(this,"Посмотреть позже",Toast.LENGTH_SHORT).show()
    }

    fun onClickToast4(view: View) {
        Toast.makeText(this,"Подборки",Toast.LENGTH_SHORT).show()
    }

    fun onClickToast5(view: View) {
        Toast.makeText(this,"Настройки",Toast.LENGTH_SHORT).show()
    }


}