package me.typosbro.myapplication

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.korean.KoreanTextRecognizerOptions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _bitmaps = MutableStateFlow<List<Bitmap>>(emptyList())
    val bitmaps = _bitmaps.asStateFlow()

    // When using Korean script library
    val recognizer = TextRecognition.getClient(KoreanTextRecognizerOptions.Builder().build())


    fun onTakePhoto(bitmap: Bitmap) {
        _bitmaps.value += bitmap


    }
}