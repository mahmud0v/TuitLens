package uz.tuit.tuitlens.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import uz.tuit.tuitlens.model.BodyRequest
import uz.tuit.tuitlens.model.TranslatorResponse
import uz.tuit.tuitlens.repository.NetworkRepository
import uz.tuit.tuitlens.utils.TranslatorResult
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel() {

    private var translateMutableLiveData = MutableLiveData<TranslatorResult<TranslatorResponse>>()
    val translateLiveData: LiveData<TranslatorResult<TranslatorResponse>> = translateMutableLiveData


    fun translateText(word:String) = viewModelScope.launch {
        networkRepository.translatorText(word).collect{
            translateMutableLiveData.value = it
        }
    }


}