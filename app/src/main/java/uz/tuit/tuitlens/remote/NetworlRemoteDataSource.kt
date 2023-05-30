package uz.tuit.tuitlens.remote

import uz.tuit.tuitlens.api.TranslatorApi
import javax.inject.Inject

class NetworkRemoteDataSource @Inject constructor(
    private val translatorApi: TranslatorApi
) {

    suspend fun translateText(word: String) = translatorApi.translateText(q = word)
}