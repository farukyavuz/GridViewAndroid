package org.faruk.gridviewandroid.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ColorPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 3

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment?
        when (position) {
            0 -> fragment = ColorFragment()
            1 -> fragment = ColorFragment()
            2 -> fragment = ColorFragment()
            else -> fragment = ColorFragment()
        }

        return fragment
    }

    override fun getCount() = COUNT

}