package dev.luischang.s3_uesan_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val tag: String = "INF-UESAN"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag,"MainActivity-->onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.i(tag,"MainActivity-->onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(tag,"MainActivity-->onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i(tag,"MainActivity-->onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(tag,"MainActivity-->onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag,"MainActivity-->onDestroy")
    }


}