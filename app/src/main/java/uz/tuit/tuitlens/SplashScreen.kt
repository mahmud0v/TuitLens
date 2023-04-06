package uz.tuit.tuitlens

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.tuit.tuitlens.databinding.SplashScreenBinding

class SplashScreen : Fragment(R.layout.splash_screen) {
    private val binding: SplashScreenBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            countDownTimer()
    }


    private fun countDownTimer(){
        val timer = object : CountDownTimer(2000L,1000L){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
               findNavController().navigate(SplashScreenDirections.actionSplashScreenToViewPagerHome())
            }

        }.start()
    }

}