package jp.techacademy.hiroaki.tanaka.interface_human

import android.util.Log

abstract class Human: Animal, Thinkable {

    abstract var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" +  this.age + "歳です。")
    }
    // Thinkable インターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える")
    }
}