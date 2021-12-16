package com.neppplus.jickbangcopy_20211216.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy_20211216.R
import com.neppplus.jickbangcopy_20211216.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData> ):ArrayAdapter<RoomData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null) {

            tempRow = mInflater.inflate(R.layout.room_list_item, null)
        }
        val row = tempRow!!

        val roomData = mList[ position ]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtDescription.text = roomData.desription

        return  row
    }

}