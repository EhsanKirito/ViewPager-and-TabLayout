package com.example.esfand26

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainFragment : Fragment(R.layout.fragment_main) {
    private val lableList:ArrayList<String> = arrayListOf("object1", "object2", "object3")
    lateinit var adaptor: ViewPagerAdaptor
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adaptor = ViewPagerAdaptor(this)
        val viewPager2 = view.findViewById<ViewPager2>(R.id.myViewPager2)

        viewPager2.adapter = adaptor
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)

        TabLayoutMediator(
            tabLayout,
            viewPager2
        ) { tab, position -> tab.text = lableList[position] }.attach()
//        viewPager2.currentItem = 1
    }
}