package com.example.cupcake

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.net.Uri
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.TextUnit
import com.example.cupcake.ui.Routes
import com.google.android.exoplayer2.text.webvtt.WebvttCssStyle
import com.google.android.exoplayer2.util.Log

@Composable
fun Productivity(navController: NavHostController) {

    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .background(MaterialTheme.colors.onSecondary)
    ) {

        Row() {
            TopAppBar(
                title = { Text("Meditation") },
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

/*  PRODUCTIVITY quote and banner */
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                "Productivity is never an accident. It is always the result of a commitment to excellence, intelligent planning, and focused effort.",
                color = MaterialTheme.colors.secondaryVariant,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                ),
                modifier = Modifier.width(310.dp)
            )
            Image(
                painter = painterResource(R.drawable.calmness),
                contentDescription = null,
                modifier = Modifier
                    .width(500.dp)
                    .height(280.dp)
            )
//            Spacer(modifier = Modifier.height(10.dp))
//
//
//            Text(
//                "Select what do you want to focus this month!",
//                color = MaterialTheme.colors.primary,
//                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
//                style = TextStyle(
//                    fontSize = 20.sp,
//                ),
//                modifier = Modifier.fillMaxWidth()
//            )

            /*row 1 ends here*/

/*
* YOUR DAILY CHECKLIST
* */

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                "YOUR DAILY CHECKLIST",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 28.sp,
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .background(MaterialTheme.colors.onPrimary)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(220.dp)
                        .fillMaxHeight()
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Wake up early",
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Start your day early",
                        color = MaterialTheme.colors.background,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                /*Tick Button click to make selections*/
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var selected by remember { mutableStateOf(false) }
                    val color =
                        if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary

                    Button(
                        onClick = { selected = !selected },
                        colors = ButtonDefaults.buttonColors(backgroundColor = color),
                        modifier = Modifier.padding(all = Dp(5F)),
                        enabled = true,
                        border = BorderStroke(
                            width = 1.dp,
                            brush = SolidColor(MaterialTheme.colors.onPrimary)
                        ),
                        shape = MaterialTheme.shapes.medium,
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.tick_button),
                            contentDescription = null,
                            modifier = Modifier
                                .width(160.dp)
                        )
                    }
                }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .background(MaterialTheme.colors.onPrimary)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(220.dp)
                        .fillMaxHeight()
                ) {

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        "Eat Healthy",
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Healthy meals 3 times a day",
                        color = MaterialTheme.colors.background,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                /*Tick Button click to make selections*/
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var selected by remember { mutableStateOf(false) }
                    val color =
                        if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary

                    Button(
                        onClick = { selected = !selected },
                        colors = ButtonDefaults.buttonColors(backgroundColor = color),
                        modifier = Modifier.padding(all = Dp(5F)),
                        enabled = true,
                        border = BorderStroke(
                            width = 1.dp,
                            brush = SolidColor(MaterialTheme.colors.onPrimary)
                        ),
                        shape = MaterialTheme.shapes.medium,
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.tick_button),
                            contentDescription = null,
                            modifier = Modifier
                                .width(160.dp)
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .background(MaterialTheme.colors.onPrimary)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(220.dp)
                        .fillMaxHeight()
                ) {

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        "Daily Workout",
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "30 Minutes of Physical Workout",
                        color = MaterialTheme.colors.background,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                /*Tick Button click to make selections*/
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var selected by remember { mutableStateOf(false) }
                    val color =
                        if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary

                    Button(
                        onClick = { selected = !selected },
                        colors = ButtonDefaults.buttonColors(backgroundColor = color),
                        modifier = Modifier.padding(all = Dp(5F)),
                        enabled = true,
                        border = BorderStroke(
                            width = 1.dp,
                            brush = SolidColor(MaterialTheme.colors.onPrimary)
                        ),
                        shape = MaterialTheme.shapes.medium,
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.tick_button),
                            contentDescription = null,
                            modifier = Modifier
                                .width(160.dp)
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .background(MaterialTheme.colors.onPrimary)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(220.dp)
                        .fillMaxHeight()
                ) {

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        "Meditate",
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "10 Minutes of Guided Meditation",
                        color = MaterialTheme.colors.background,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                /*Tick Button click to make selections*/
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var selected by remember { mutableStateOf(false) }
                    val color =
                        if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary

                    Button(
                        onClick = { selected = !selected },
                        colors = ButtonDefaults.buttonColors(backgroundColor = color),
                        modifier = Modifier.padding(all = Dp(5F)),
                        enabled = true,
                        border = BorderStroke(
                            width = 1.dp,
                            brush = SolidColor(MaterialTheme.colors.onPrimary)
                        ),
                        shape = MaterialTheme.shapes.medium,
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.tick_button),
                            contentDescription = null,
                            modifier = Modifier
                                .width(160.dp)
                        )
                    }
                }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .background(MaterialTheme.colors.onPrimary)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(220.dp)
                        .fillMaxHeight()
                ) {

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        "Daily Workout",
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "30 Minutes of Physical Workout",
                        color = MaterialTheme.colors.background,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                /*Tick Button click to make selections*/
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var selected by remember { mutableStateOf(false) }
                    val color =
                        if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary

                    Button(
                        onClick = { selected = !selected },
                        colors = ButtonDefaults.buttonColors(backgroundColor = color),
                        modifier = Modifier.padding(all = Dp(5F)),
                        enabled = true,
                        border = BorderStroke(
                            width = 1.dp,
                            brush = SolidColor(MaterialTheme.colors.onPrimary)
                        ),
                        shape = MaterialTheme.shapes.medium,
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.tick_button),
                            contentDescription = null,
                            modifier = Modifier
                                .width(160.dp)
                        )
                    }
                }

            }

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .background(MaterialTheme.colors.onPrimary)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(220.dp)
                        .fillMaxHeight()
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Clear the Backlog",
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Finish your pending assignments",
                        color = MaterialTheme.colors.background,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                /*Tick Button click to make selections*/
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var selected by remember { mutableStateOf(false) }
                    val color =
                        if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary

                    Button(
                        onClick = { selected = !selected },
                        colors = ButtonDefaults.buttonColors(backgroundColor = color),
                        modifier = Modifier.padding(all = Dp(5F)),
                        enabled = true,
                        border = BorderStroke(
                            width = 1.dp,
                            brush = SolidColor(MaterialTheme.colors.onPrimary)
                        ),
                        shape = MaterialTheme.shapes.medium,
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.tick_button),
                            contentDescription = null,
                            modifier = Modifier
                                .width(160.dp)
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .background(MaterialTheme.colors.onPrimary)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(220.dp)
                        .fillMaxHeight()
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Under the Sun",
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Watch Sunrise or Sunset",
                        color = MaterialTheme.colors.background,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier.width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                /*Tick Button click to make selections*/
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var selected by remember { mutableStateOf(false) }
                    val color =
                        if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary

                    Button(
                        onClick = { selected = !selected },
                        colors = ButtonDefaults.buttonColors(backgroundColor = color),
                        modifier = Modifier.padding(all = Dp(5F)),
                        enabled = true,
                        border = BorderStroke(
                            width = 1.dp,
                            brush = SolidColor(MaterialTheme.colors.onPrimary)
                        ),
                        shape = MaterialTheme.shapes.medium,
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.tick_button),
                            contentDescription = null,
                            modifier = Modifier
                                .width(160.dp)
                        )
                    }
                }

            }


            Spacer(modifier = Modifier.height(30.dp))
            /*

        productivity tips

        */
            Text(
                "PRODUCTIVITY TIPS FOR YOU",
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
                    painter = painterResource(R.drawable.tp1),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.tp2),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.tp3),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.tp4),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.tp5),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(R.drawable.tp6),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))


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
