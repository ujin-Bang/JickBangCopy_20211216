package com.neppplus.jickbangcopy_20211216

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20211216.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20211216.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<RoomData>()
    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add( RoomData(8000,"서울시 동대문구", 5,"첫번째 방입니다."))
        mRooms.add( RoomData(18000,"서울시 서대문구",0,"두번째 방입니다."))
        mRooms.add( RoomData(29700,"경기도 고양시",17,"세번째 방입니다."))
        mRooms.add( RoomData(4300,"서울시 중구",-2,"네번째 방입니다"))
        mRooms.add( RoomData(175300,"서울시 송파구",20,"다섯번째 방입니다"))

        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item, mRooms)
        roomListView.adapter = mRoomAdapter


    }
}