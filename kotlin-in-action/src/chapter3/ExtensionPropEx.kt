package chapter3

var StringBuilder.lashChar: Char
    get() = this[length-1]
    set(value: Char) = this.setCharAt(length-1, value)