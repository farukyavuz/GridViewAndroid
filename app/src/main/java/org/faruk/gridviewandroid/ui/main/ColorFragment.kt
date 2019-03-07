package org.faruk.gridviewandroid.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.faruk.gridviewandroid.base.BaseFragment
import org.faruk.gridviewandroid.model.ColorModel
import org.faruk.gridviewandroid.ui.detail.ColorDetailActivity
import org.faruk.gridviewandroid.util.ColorUtil
import kotlinx.android.synthetic.main.fragment_color.*
import org.faruk.gridviewandroid.R
import org.faruk.gridviewandroid.util.GridSpacingItemDecoration

class ColorFragment : BaseFragment() {

    private val colorItemClicked: (colorModel: ColorModel?) -> Unit = {
        ColorDetailActivity.start(context, it)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_color, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        colorRecyclerView.setHasFixedSize(true)
        colorRecyclerView.addItemDecoration(GridSpacingItemDecoration(2, 40, true))

        colorRecyclerView.adapter =
            ColorListAdapter(activity, ColorUtil.getRandomColorList().toMutableList(), colorItemClicked)
    }

}
