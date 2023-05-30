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
        const val BASE_URL = "https://google-translate1.p.rapidapi.com/"
        const val API_KEY1 = "275ff8cf71msh5090b48aadd2474p15cec9jsn4eb4ed86fb02"
        const val API_KEY2 = "a79e86909cmshf22db63b4a8ec95p1a3f02jsn9e9dfedd8b2b"
        const val API_KEY3 = "6019a8ed7fmshba02b7446c37c1ap1c5287jsn03269fee9fbe"
        const val API_KEY4 = "bd8b0fc889mshb3ca46c9ce4517cp1b0928jsnf387f6f7b905"
        const val HOST_KEY = "google-translate1.p.rapidapi.com"


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