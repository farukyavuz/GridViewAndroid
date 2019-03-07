package org.faruk.gridviewandroid.ui.main

import android.os.Bundle
import org.faruk.gridviewandroid.base.BaseActivity
import kotlinx.android.synthetic.main.activity_color.*
import org.faruk.gridviewandroid.R

class ColorActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        val adapter = ColorPagerAdapter(supportFragmentManager)
        colorViewPager.adapter = adapter
        colorIndicator.setViewPager(colorViewPager)
    }

}
