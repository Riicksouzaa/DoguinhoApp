package com.example.doguinhoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide
            .with(this)
            .load("https://i0.wp.com/www.swiss-miss.com/wp-content/uploads/2018/07/7LKQLPM.gif?ssl=1")
            .circleCrop()
            .into(dog_image)


        supportActionBar?.title = this.getString(R.string.app_name)
        supportActionBar?.setBackgroundDrawable(getDrawable(R.drawable.bg_transparent))
        supportActionBar?.setDisplayShowCustomEnabled(true)



//        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
//        supportActionBar?.setDisplayShowCustomEnabled(true)
//        supportActionBar?.setBackgroundDrawable(getDrawable(R.drawable.bg_gradient))
//        supportActionBar?.setCustomView(R.layout.custom_action_bar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        supportActionBar?.customView
    }
}
