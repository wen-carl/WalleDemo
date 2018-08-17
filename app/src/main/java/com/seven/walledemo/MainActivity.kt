package com.seven.walledemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.meituan.android.walle.WalleChannelReader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.text = WalleChannelReader.getChannel(this)
    }
}
