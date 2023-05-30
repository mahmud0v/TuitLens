package uz.tuit.tuitlens.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import uz.tuit.tuitlens.R
import uz.tuit.tuitlens.databinding.WelcomeScreenBinding
import uz.tuit.tuitlens.model.BodyRequest
import uz.tuit.tuitlens.model.TranslatorResponse
import uz.tuit.tuitlens.utils.TranslatorResult
import uz.tuit.tuitlens.viewmodel.HomeViewModel

@AndroidEntryPoint
class WelcomeScreen : Fragment(R.layout.welcome_screen) {
    private val binding: WelcomeScreenBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.takePicBtn.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeScreen_to_takePhotoScreen)
        }





    }

    private val translateObserver = Observer<TranslatorResult<TranslatorResponse>>{
        when(it){
            is TranslatorResult.Success -> {
                Snackbar.make(binding.takePicBtn,"${it.data?.data!!.translations[0].translatedText}",Snackbar.LENGTH_SHORT).show()

            }

            is TranslatorResult.Error -> {
                Snackbar.make(binding.takePicBtn,"${it.message}",Snackbar.LENGTH_SHORT).show()

            }

            else -> {}
        }
    }
}