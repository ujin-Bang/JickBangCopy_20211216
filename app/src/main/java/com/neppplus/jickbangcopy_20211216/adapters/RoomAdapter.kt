package com.neppplus.jickbangcopy_20211216.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20211216.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData> ):ArrayAdapter<RoomData>(mContext, resId, mList) {
}