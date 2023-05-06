package com.qiniu.qplayer2.ui.page.main

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.qiniu.qplayer2.BuildConfig
import com.qiniu.qplayer2.R
import com.qiniu.qplayer2.RtmpConfig
import com.qiniu.qplayer2.ui.page.longvideo.LongVideoActivity
import com.qiniu.qplayer2.ui.page.simplelongvideo.SimpleLongVideoActivity
import com.qiniu.qplayer2.ui.page.setting.SettingActivity
import com.qiniu.qplayer2.ui.page.shortvideo.ShortVideoActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.simple_long_video_player_BTN).setOnClickListener {
            val intent = Intent(this, SimpleLongVideoActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.long_video_player_BTN).setOnClickListener {
            val intent = Intent(this, LongVideoActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.setting_BTN).setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.short_video_player_BTN).setOnClickListener {
            val intent = Intent(this, ShortVideoActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.build_time_TV).setText(BuildConfig.QPLAYER2_DEMO_BUILD_TIME)

        findViewById<TextView>(R.id.version_TV).setText("core version:${BuildConfig.VERSION_NAME}")
        // Example of a call to a native method

        findViewById<TextView>(R.id.tv_custom_rtmp).text = RtmpConfig.url
    }
}