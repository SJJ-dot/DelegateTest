package com.sjianjun.test.kotlin.delegate

import androidx.annotation.Keep
import kotlin.reflect.KProperty

@Keep
class DelegateTest {
    var value: Any? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Any {
        return "value:$value $property"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Any) {
        this.value = value
    }

}