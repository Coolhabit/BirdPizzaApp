package com.example.birdpizzaapp.baseui.presentation.base

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ItemDecoration(
    private val context: Context,
    private val top: Int,
    private val left: Int,
    private val right: Int,
    private val bottom: Int?
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top = context.resources.getDimensionPixelSize(top)
        outRect.left = context.resources.getDimensionPixelSize(left)
        outRect.right = context.resources.getDimensionPixelSize(right)
        if (bottom != null) {
            outRect.bottom = context.resources.getDimensionPixelSize(bottom)
        }
    }
}
