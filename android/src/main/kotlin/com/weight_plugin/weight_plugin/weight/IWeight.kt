package com.weight_plugin.weight_plugin.weight

import android.content.Context

interface IWeight {

    fun initWeight(context: Context, weightCallback: WeightCallback)

    fun zero()

    fun tare()
}

interface WeightCallback {

    fun callBack(weightMode: WeightMode)
}