package uz.tuit.tuitlens

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.tuit.tuitlens.databinding.PagerItemLayoutBinding
import uz.tuit.tuitlens.utils.LabelWords.Companion.PAGER_KEY

class ViewPagerScreen : Fragment(R.layout.pager_item_layout) {
    private val binding:PagerItemLayoutBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val position = requireArguments().getInt(PAGER_KEY)
        Toast.makeText(requireContext(), "$position", Toast.LENGTH_SHORT).show()
    }
}