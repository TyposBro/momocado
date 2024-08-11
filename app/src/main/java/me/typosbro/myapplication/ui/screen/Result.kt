package me.typosbro.myapplication.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import me.typosbro.myapplication.R


val textColorWhite = Color(0xffFAF6F3)

@Composable
fun Result(
    modifier: Modifier = Modifier,
    bg: Color = Color(0xFFFF5114),
    text: String = "BEST TO\n AVOID",
    image: Int = R.drawable.bad,
    desc: String = "Bad",
) {

    Surface(
        modifier = modifier.fillMaxSize(), color = bg
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {


            Box(modifier = modifier.weight(1f)) {
                Text(
                    text = text,
                    color = textColorWhite,
                    fontSize = 48.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = modifier.align(Alignment.Center)
                )
            }
            Box(
                modifier = modifier, contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = desc,
                    modifier = modifier.align(Alignment.BottomCenter)
                )


            }
        }
    }
}


@Composable
@Preview
fun ResultPreview() {
    Result()
}