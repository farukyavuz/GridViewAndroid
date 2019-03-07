package org.faruk.gridviewandroid.ui.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.faruk.gridviewandroid.R
import org.faruk.gridviewandroid.base.BaseListModel

open class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun viewHolderFactory(inflater: LayoutInflater, parent: ViewGroup, type: Int): BaseViewHolder {
            return when (type) {
                BaseListModel.TYPE_REGULAR -> RegularViewHolder(
                    inflater.inflate(
                        R.layout.list_item_color,
                        parent,
                        false
                    )
                )
                else -> {
                    //TODO Empty ViewHolder...
                    RegularViewHolder(
                        inflater.inflate(
                            R.layout.list_item_color,
                            parent,
                            false
                        )
                    )
                }
            }
        }
    }

}