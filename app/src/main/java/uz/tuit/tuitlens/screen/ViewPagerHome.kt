package uz.tuit.tuitlens.screen

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.tuit.tuitlens.R
import uz.tuit.tuitlens.adapter.ViewPagerAdapter
import uz.tuit.tuitlens.databinding.ViewPagerHomeBinding
import uz.tuit.tuitlens.utils.LabelWords.Companion.LAST_PAGER
import uz.tuit.tuitlens.utils.LabelWords.Companion.SHARED_KEY
import uz.tuit.tuitlens.utils.LabelWords.Companion.SHARED_PAGER_NAME

class ViewPagerHome : Fragment(R.layout.view_pager_home) {
    private val binding: ViewPagerHomeBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initPager()
        btnAttachPager()
        clickSkip()
    }


    private fun initPager() {
        val adapter = ViewPagerAdapter(this)
        binding.viewPager2.adapter = adapter
        binding.dotIndicator.attachTo(binding.viewPager2)

    }

    private fun btnAttachPager() {
        binding.pagerBtnLayout.setOnClickListener {
            var currentItem = binding.viewPager2.currentItem
            if (currentItem == 2) {
                findNavController().navigate(ViewPagerHomeDirections.actionViewPagerHomeToHomeScreen())
                saveLastPagerPosition(currentItem)
            } else {
                binding.viewPager2.currentItem = currentItem + 1
            }
        }
    }

    private fun saveLastPagerPosition(position:Int) {
        val sharedPref =
            requireContext().getSharedPreferences(SHARED_PAGER_NAME, Context.MODE_PRIVATE)
        sharedPref.edit().putInt(SHARED_KEY, LAST_PAGER).commit()

    }

    private fun clickSkip() {
        binding.skipLayout.setOnClickListener {
            var currentItem = binding.viewPager2.currentItem
            findNavController().navigate(ViewPagerHomeDirections.actionViewPagerHomeToHomeScreen())
            saveLastPagerPosition(currentItem)
        }
    }


}