package uz.tuit.tuitlens.api

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query
import uz.tuit.tuitlens.model.TranslatorResponse
import uz.tuit.tuitlens.utils.LabelWords.Companion.API_KEY2
import uz.tuit.tuitlens.utils.LabelWords.Companion.API_KEY4
import uz.tuit.tuitlens.utils.LabelWords.Companion.HOST_KEY

interface TranslatorApi {


    @FormUrlEncoded
    @POST("language/translate/v2")
    suspend fun translateText(
        @Header("X-RapidAPI-Key") key: String = API_KEY4,
        @Header("X-RapidAPI-Host") host: String = HOST_KEY,
        @Field("q") q: String,
        @Field("target") target: String = "uz",
        @Field("source") source: String = "en"
    ): Response<TranslatorResponse>


}