package uz.tuit.tuitlens.screen

import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.tuit.tuitlens.R
import uz.tuit.tuitlens.databinding.SplashScreenBinding
import uz.tuit.tuitlens.utils.LabelWords.Companion.SHARED_KEY
import uz.tuit.tuitlens.utils.LabelWords.Companion.SHARED_PAGER_NAME

class SplashScreen : Fragment(R.layout.splash_screen) {
    private val binding: SplashScreenBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        countDownTimer()
    }


    private fun countDownTimer() {
        val timer = object : CountDownTimer(2000L, 1000L) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                if (getLastPagerIndex() == 2) {
                    findNavController().navigate(SplashScreenDirections.moveToHomeScreen())
                } else {
                    findNavController().navigate(SplashScreenDirections.moveToViewPagerHome())
                }
            }

        }.start()
    }


    private fun getLastPagerIndex(): Int {
        val sharedPref =
            requireContext().getSharedPreferences(SHARED_PAGER_NAME, Context.MODE_PRIVATE)
        return sharedPref.getInt(SHARED_KEY, -1)
    }

}