package uz.tuit.tuitlens.screen

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.tuit.tuitlens.R
import uz.tuit.tuitlens.databinding.PagerItemLayoutBinding
import uz.tuit.tuitlens.utils.LabelWords
import uz.tuit.tuitlens.utils.LabelWords.Companion.PAGER_KEY

class ViewPagerScreen : Fragment(R.layout.pager_item_layout) {
    private val binding: PagerItemLayoutBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setData()
    }

    private fun setData() {
        val position = requireArguments().getInt(PAGER_KEY)
        val data = LabelWords.getPagerData()[position]
        binding.imgId.setImageResource(data.image)
        binding.firstHeadline.text = resources.getString(data.headline)
        binding.desc.text = resources.getString(data.description)
    }


}