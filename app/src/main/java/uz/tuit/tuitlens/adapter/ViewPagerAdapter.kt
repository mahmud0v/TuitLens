package uz.tuit.tuitlens.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.tuit.tuitlens.screen.ViewPagerScreen
import uz.tuit.tuitlens.utils.LabelWords.Companion.PAGER_COUNT
import uz.tuit.tuitlens.utils.LabelWords.Companion.PAGER_KEY

class ViewPagerAdapter(fm: Fragment) : FragmentStateAdapter(fm) {

    override fun getItemCount() = PAGER_COUNT

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerScreen()
        val bundle = Bundle().apply {
            putInt(PAGER_KEY, position)
        }
        fragment.arguments = bundle
        return fragment
    }
}