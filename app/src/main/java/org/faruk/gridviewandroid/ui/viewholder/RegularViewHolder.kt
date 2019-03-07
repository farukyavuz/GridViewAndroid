package org.faruk.gridviewandroid.ui.viewholder

import android.view.View
import org.faruk.gridviewandroid.model.ColorModel

class RegularViewHolder(itemView: View) : BaseViewHolder(itemView) {

    fun bindViews(colorModel: ColorModel?, itemClicked: (colorModel: ColorModel?) -> Unit) {

        colorModel?.color?.let { itemView.setBackgroundColor(it) }

        itemView.viewTreeObserver.addOnGlobalLayoutListener {
            val side = itemView.measuredWidth
            val lp = itemView.layoutParams
            lp.width = side
            lp.height = side
            itemView.layoutParams = lp
        }

        itemView.setOnClickListener {
            itemClicked(colorModel)
        }
    }
}