package com.arkcloud.buildsrcdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.orhanobut.logger.Logger
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val DATA = "{\"age\":12,\"name\":\"lily\"}"

    private var jsonArrayDATA = "[\"Android\",\"Java\",\"PHP\"]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener {
            val student = StudentBean("lily", "女", 12)

            val toJson = Gson().toJson(student)

            Logger.d(toJson)
        }

        btntwo.setOnClickListener {

            val fromJson = Gson().fromJson(DATA, StudentBean::class.java)

            Logger.d( fromJson.toString())


            val fromJsonArray = Gson().fromJson<List<String>>(jsonArrayDATA, object : TypeToken<List<String>>() {}.type)
            fromJsonArray.forEach {
                Logger.d(it)
            }

        }

    }
}
