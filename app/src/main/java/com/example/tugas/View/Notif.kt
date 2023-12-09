package com.example.tugas.View

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas.R

class Notif : AppCompatActivity() {


//    private lateinit var binding: ActivityNotifBinding
//    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityNotifBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_notif)

//        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
//
//        with(binding){
//            viewPager.adapter = viewPagerAdapter
//
//            TabLayoutMediator(tabLayout, viewPager){ tab, position ->
//                when(position){
//                    0 -> tab.text = "Tab 1"
//                    1 -> tab.text = "Tab 2"
//                }
//            }.attach()
//        }

        val backButton = findViewById(R.id.ivBack) as ImageView

        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}