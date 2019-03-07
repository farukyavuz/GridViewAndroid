package org.faruk.gridviewandroid.util

import android.graphics.Color
import org.faruk.gridviewandroid.model.ColorModel
import kotlin.random.Random

class ColorUtil{

    companion object {

        fun getRandomColor() : Int {

            val red = Random.nextInt(0, 256)
            val green = Random.nextInt(0, 256)
            val blue = Random.nextInt(0, 256)

            return Color.rgb(red, green, blue)

        }

        fun getRandomColorList() : MutableList<ColorModel>{

            val colorModelList = ArrayList<ColorModel>()
            val random = Random.nextInt(1, 7)

            for (i in 0 until random) {
                colorModelList.add(ColorModel(getRandomColor()))
            }

            return colorModelList
        }
    }

}