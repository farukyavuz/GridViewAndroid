package org.faruk.gridviewandroid.ui.detail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.faruk.gridviewandroid.model.ColorModel
import kotlinx.android.synthetic.main.activity_color_detail.*
import org.faruk.gridviewandroid.R

class ColorDetailActivity : AppCompatActivity() {

    private var colorModel: ColorModel? = null

    companion object {
        fun start(context: Context?, colorModel: ColorModel?) {
            val intent = Intent(context, ColorDetailActivity::class.java)
            intent.putExtra("colorModel", colorModel)
            context?.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_detail)

        colorModel = intent.getParcelableExtra("colorModel")

        colorModel?.color?.let {
            colorDetailRootView.setBackgroundColor(it)
        }
    }
}
