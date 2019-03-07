package org.faruk.gridviewandroid.model

import android.os.Parcelable
import org.faruk.gridviewandroid.base.BaseListModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ColorModel(
    val color: Int?
) : BaseListModel, Parcelable {
    override val type: Int
        get() = BaseListModel.TYPE_REGULAR
}