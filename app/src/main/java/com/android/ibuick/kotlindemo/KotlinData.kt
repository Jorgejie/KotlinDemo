package com.android.ibuick.kotlindemo

class KotlinData(name: String) {
    var name: String? = null
    var phone: Int? = 0
    init {
        this.name = name//主构造器
    }
    //次构造器
    constructor(name: String, phone: Int) : this(name)
}