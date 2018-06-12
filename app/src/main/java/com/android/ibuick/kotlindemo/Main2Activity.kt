package com.android.ibuick.kotlindemo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private var context : Context = this
    private var id : Int = 1
    var kotlinData: KotlinData? = null
    /**
     * val和var的区别
     * val:表示是final型的不可变必须初始化
     * var:是可变的
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button.setOnClickListener(View.OnClickListener {
            HellowKotlin().toastData(context)
            button.text = "吐司啊"+id
        })
        kotlinData = KotlinData("heh", 2)

    }
}
