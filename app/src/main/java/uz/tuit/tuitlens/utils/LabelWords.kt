package uz.tuit.tuitlens.utils

import uz.tuit.tuitlens.R
import uz.tuit.tuitlens.model.PagerInfo

class LabelWords {

    companion object {
        const val PAGER_COUNT = 3
        const val PAGER_KEY = "PAGER_KEY"
        const val SHARED_PAGER_NAME = "PAGER_NAME"
        const val SHARED_KEY = "SHARED_KEY"
        const val LAST_PAGER = 2


        fun getPagerData(): ArrayList<PagerInfo> {
            return arrayListOf(
                PagerInfo(
                    R.drawable.first_pager_pic,
                    R.string.pager_first_headline,
                    R.string.pager_first_desc
                ),
                PagerInfo(
                    R.drawable.second_pager_pic,
                    R.string.pager_second_headline,
                    R.string.pager_second_desc
                ),

                PagerInfo(
                    R.drawable.third_pager_pic,
                    R.string.pager_third_headline,
                    R.string.pager_third_desc
                )

            )
        }
    }
}