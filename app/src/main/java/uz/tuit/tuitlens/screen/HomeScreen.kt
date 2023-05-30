package uz.tuit.tuitlens.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.TextRecognizer
import com.google.mlkit.vision.text.latin.TextRecognizerOptions
import dagger.hilt.android.AndroidEntryPoint
import uz.tuit.tuitlens.R

@AndroidEntryPoint
class HomeScreen : Fragment(R.layout.welcome_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)


    }
}