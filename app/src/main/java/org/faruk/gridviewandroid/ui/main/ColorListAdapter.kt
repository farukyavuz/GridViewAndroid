package org.faruk.gridviewandroid.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.faruk.gridviewandroid.base.BaseListModel
import org.faruk.gridviewandroid.ui.viewholder.BaseViewHolder
import org.faruk.gridviewandroid.model.ColorModel
import org.faruk.gridviewandroid.ui.viewholder.RegularViewHolder

class ColorListAdapter(
    context: Context?,
    private val itemList: MutableList<BaseListModel>?,
    private val itemClicked: (colorModel: ColorModel?) -> Unit)
    : RecyclerView.Adapter<BaseViewHolder>() {

    private var inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder.viewHolderFactory(inflater, parent, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        when (itemList?.get(position)?.type) {
            BaseListModel.TYPE_REGULAR -> (holder as RegularViewHolder).bindViews(itemList[position] as ColorModel?, itemClicked)
        }
    }

    override fun getItemCount() = itemList?.count() ?: 0

    override fun getItemViewType(position: Int) = itemList?.get(position)?.type ?: BaseListModel.TYPE_EMPTY
}