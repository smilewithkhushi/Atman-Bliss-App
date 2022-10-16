package com.example.cupcake

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.MaterialTheme
import androidx.navigation.NavHostController
import androidx.compose.material.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.graphics.SolidColor
import com.example.cupcake.ui.Routes


@Composable
fun Memes(navController: NavHostController) {

    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .background(MaterialTheme.colors.onSecondary)
    ) {

        Row() {
            TopAppBar(
                title = { Text("Memes") },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(Routes.OptionScreen.route)
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back_button)
                        )
                    }
                }
            )
        }

        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                "Laughter is the best medicine (but if you laugh without any reason, you need medicine)",
                color = MaterialTheme.colors.secondaryVariant,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                ),
                modifier = Modifier.width(300.dp)
            )
            Image(
                painter = painterResource(R.drawable.new_hehe),
                contentDescription = null,
                modifier = Modifier
                    .width(500.dp)
                    .height(200.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                "Swipe to see the collection of wholesome memes (specially for you)",
                color = MaterialTheme.colors.background,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 18.sp,
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))



            /*

            RESPECTFUL MEMES

            */
            Text(
                "ANIMAL MEMES",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 25.sp,
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))

            /*scrollable meme list*/
            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.onPrimary)
                    .padding(10.dp)
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__1_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__4_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__6_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__8_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__9_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))
            }

            Spacer(modifier = Modifier.width(40.dp))


            /*
            RESPECTFUL MEMES
            */

            Text(
                "RESPECTFUL MEMES",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 25.sp,
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.onPrimary)
                    .padding(10.dp)
            ) {

                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.memes_jpeg),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__3_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__5_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__2_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.memes_jpg__1_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.res__7_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(350.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.memes_jpg__2_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.memes_jpg__3_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.memes_jpg__4_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.memes_jpg__5_),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Image(
                    painter = painterResource(R.drawable.flowerfooter),
                    contentDescription = null,
                    modifier = Modifier.width(600.dp)
                )
            }
        }
    }
}

