package uz.tuit.tuitlens.model

data class TranslatorResponse(
    val data: Translations
)

data class Translations(
    val translations: ArrayList<TranslatorText>
)

data class TranslatorText(
    val translatedText: String
)