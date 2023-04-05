package uz.tuit.tuitlens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        countDownTimer()

    }


    private fun countDownTimer(){
        val timer = object : CountDownTimer(2000L,1000L){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@MainActivity,SecondActivity::class.java))
            }

        }.start()
    }

}