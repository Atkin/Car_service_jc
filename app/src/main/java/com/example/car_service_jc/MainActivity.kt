package com.example.car_service_jc

import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableWrapper
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.car_service_jc.ui.theme.Car_service_jcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Car_service_jcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.background(Color(0xFFF1F5F9))
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_close_round),
            contentDescription = "Localized description",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clickable {

                }
                .align(Alignment.End)
                .padding(0.dp, 18.dp, 18.dp, 26.dp)

        )

        Text(
            text = "Запись прошла успешно",
            style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.W500,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center
            ), modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_autoservice_image_2),
            contentDescription = "Localized description",
            modifier = Modifier
                .padding(0.dp, 26.dp, 0.dp, 60.dp)
                .align(Alignment.CenterHorizontally)
        )

        Text(
            text = "Вы можете выбрать другое время и дату или отменить запись в любой момент",
            style = TextStyle(
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.W400,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Start
            ), modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(12.dp, 0.dp, 12.dp, 25.dp)
        )

        Button(
            onClick = {

            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(12.dp, 0.dp, 12.dp, 20.dp),
            shape = RoundedCornerShape(10.dp),
            contentPadding = PaddingValues(0.dp, 13.dp, 0.dp, 13.dp),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.White,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Перезаписаться",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            )
        }

        Button(
            onClick = {

            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(12.dp, 0.dp, 12.dp, 20.dp),
            shape = RoundedCornerShape(10.dp),
            contentPadding = PaddingValues(0.dp, 13.dp, 0.dp, 13.dp),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.White,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Отменить запись",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            )
        }

        Row() {
            Button(
                onClick = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp, 0.dp, 16.dp, 20.dp)
                    .weight(1f),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(0.dp, 13.dp, 0.dp, 13.dp),
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.White
                )
            ) {
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.ic_phone_gray),
                        contentDescription = "Localized description",
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 6.dp, 0.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "Звонок на станцию",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            fontFamily = FontFamily.SansSerif,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }

            Button(
                onClick = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp, 0.dp, 16.dp, 20.dp)
                    .weight(1f),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(0.dp, 13.dp, 0.dp, 13.dp),
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.White
                )
            ) {
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.ic_message_gray),
                        contentDescription = "Localized description",
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 6.dp, 0.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "Чат со станцией",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            fontFamily = FontFamily.SansSerif,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }

        Button(
            onClick = {

            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(0.dp, 36.dp, 0.dp, 12.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(71.dp, 17.dp, 72.dp, 17.dp),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(0xFF312E81),
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Понятно",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Car_service_jcTheme {
        Greeting("Android")
    }
}