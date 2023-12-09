package com.example.tugas.ViewModel

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tugas.View.Tab1
import com.example.tugas.View.Tab2

class ViewPagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = Tab1()
            1 -> fragment = Tab2()
        }
        return fragment
    }

}