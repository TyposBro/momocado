package me.typosbro.myapplication.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import me.typosbro.myapplication.R

@Composable
fun Home() {
    Result()
    Result(
        bg = Color(0xFFFFDF40),
        text = "ENJOY \n IN LIMITS",
        image = R.drawable.meh,
        desc = "Meh"
    )
    Result(
        bg = Color(0xFF01B26E),
        text = "ENJOY FREELY",
        image = R.drawable.good,
        desc = "Good"
    )

}


@Preview
@Composable
fun HomePreview() {
    Home()
}