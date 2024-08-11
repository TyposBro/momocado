package me.typosbro.myapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person2
import androidx.compose.material.icons.outlined.QrCode2
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val color = Color(0xFF007AFF)

@Composable
fun NavBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 30.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        MyButton(modifier = modifier, icon = Icons.Outlined.Home, text = "Home")
        MyButton(modifier = modifier, icon = Icons.Outlined.QrCode2, text = "Scan")
        MyButton(modifier = modifier)

    }
}


@Composable
fun MyButton(
    modifier: Modifier,
    icon: ImageVector = Icons.Outlined.Person2,
    text: String = "Profile",
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = color
        ),
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "",
                modifier = modifier.size(20.dp)
            )
            Text(text = text)
        }
    }
}

@Preview
@Composable
fun NavBarPreview() {
    NavBar()
}