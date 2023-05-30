package uz.tuit.tuitlens.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.tuit.tuitlens.model.BodyRequest
import uz.tuit.tuitlens.model.TranslatorResponse
import uz.tuit.tuitlens.remote.NetworkRemoteDataSource
import uz.tuit.tuitlens.utils.TranslatorResult
import javax.inject.Inject

class NetworkRepository @Inject constructor(
    private val networkRemoteDataSource: NetworkRemoteDataSource
) {

    suspend fun translatorText(word:String): Flow<TranslatorResult<TranslatorResponse>> {
        val response = networkRemoteDataSource.translateText(word)

        return if (response.isSuccessful) {
            flow {
                emit(TranslatorResult.Success(response.body()!!))
            }
        } else {
            flow {
                emit(TranslatorResult.Error(response.message()))
            }
        }

    }

}