package org.techtown.viewbinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.techtown.viewbinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

     setContentView(binding.root)

     binding.visibleBtn.setOnClickListener {
         binding.targetView.visibility = View.VISIBLE
     }
     binding.invisibleBtn.setOnClickListener {
         binding.targetView.visibility = View.INVISIBLE
     }

    }

}


