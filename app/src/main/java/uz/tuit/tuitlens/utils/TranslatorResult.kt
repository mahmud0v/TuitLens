package uz.tuit.tuitlens.utils


sealed class TranslatorResult<T>(
    val data:T? = null,
    val message:String? = null
) {
    class Success<T>(data:T) : TranslatorResult<T>(data)
    class Error<T>(message:String):TranslatorResult<T>(message = message)
    class Loading<T> : TranslatorResult<T>()
}