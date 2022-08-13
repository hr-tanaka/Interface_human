package jp.techacademy.hiroaki.tanaka.interface_human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.techacademy.hiroaki.tanaka.interface_human.Human

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("モーツアルト", 35, "音楽")

        human1.say()
        human1.think()

        val human2 = Human("カールルイス", 24, "陸上")

        human2.say()
        human2.think()
    }
}