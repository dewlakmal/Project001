package com.example.project01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listEventListener()
    }

    public fun radiobuttonClick(view: View) {

        val imageView = findViewById<ImageView>(R.id.imageView)

        when(view.id){
            R.id.mario_btn-> imageView.setImageResource(R.drawable.mario)
            R.id.luigi_btn-> imageView.setImageResource(R.drawable.luigi)
            R.id.peach_btn-> imageView.setImageResource(R.drawable.peach)
            R.id.bowser_btn-> imageView.setImageResource(R.drawable.bowser)
        }
    }

    public fun listEventListener(){

        val listView = findViewById<ListView>(R.id.list_characters)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{

            override  fun onItemClick(p0:AdapterView<*>?, p1:View?, positionAtList: Int, id: Long){
                val imageView = findViewById<ImageView>(R.id.imageView)
                if(positionAtList==0){
                    imageView.setImageResource(R.drawable.mario)
                }else if(positionAtList==1){
                    imageView.setImageResource(R.drawable.luigi)
                }else if(positionAtList==2){
                    imageView.setImageResource(R.drawable.peach)
                }else{
                    imageView.setImageResource(R.drawable.bowser)
                }
            }



        }


    }
}