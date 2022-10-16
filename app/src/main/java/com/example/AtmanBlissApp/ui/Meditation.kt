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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun Meditation(navController: NavHostController) {

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

/*  MEDITATION quote and banner */
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                "Calmness of mind is one of the beautiful jewels of wisdom",
                color = MaterialTheme.colors.secondaryVariant,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                ),
                modifier = Modifier.width(310.dp)
            )
            Image(
                painter = painterResource(R.drawable.medi_banner),
                contentDescription = null,
                modifier = Modifier
                    .width(500.dp)
                    .height(280.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))


            Text(
                "Select the type of meditation you would like to practice today",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                ),
                modifier = Modifier.fillMaxWidth()
            )


            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .border(
                            BorderStroke(
                                2.dp,
                                color = MaterialTheme.colors.secondary
                            )
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp)
                            .width(150.dp)
                            .fillMaxHeight()
                    ) {
                        Image(
                            painter = painterResource(R.drawable.loving_kindness1),
                            contentDescription = null,
                            modifier = Modifier
                                .width(200.dp)
                                .height(150.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            "Loving-Kindness Meditation",
                            color = MaterialTheme.colors.secondary,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 15.sp,
                            ),
                            modifier = Modifier.width(200.dp)
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            "This type is also known as Metta meditation. Its goal is to cultivate an attitude of love and kindness toward everything, even a person’s enemies and sources of stress",
                            color = MaterialTheme.colors.background,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp,
                            ),
                            modifier = Modifier.width(200.dp)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        /*Button click to get started*/
                        Column(
                            modifier = Modifier.width(250.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            val url = "https://www.youtube.com/watch?v=sDi40FQcaIU"
                            val ctx = LocalContext.current
                            Button(
                                onClick = {
                                    Log.e("tag", url)
                                    val urlIntent = Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(url)
                                    )
                                    ctx.startActivity(urlIntent)
                                },
                                modifier = Modifier.padding(all = Dp(5F)),
                                enabled = true,
                                border = BorderStroke(
                                    width = 3.dp,
                                    brush = SolidColor(MaterialTheme.colors.primary)
                                ),
                                shape = MaterialTheme.shapes.medium,
                            )
                            {
                                Text(
                                    text = "Click here",
                                    style = TextStyle(
                                        fontSize = 13.sp,
                                    ),
                                    color = MaterialTheme.colors.onPrimary
                                )
                            }
                        }

                    }
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .border(
                            BorderStroke(
                                2.dp,
                                color = MaterialTheme.colors.secondary
                            )
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp)
                            .width(150.dp)
                            .fillMaxHeight()
                    ) {
                        Image(
                            painter = painterResource(R.drawable.progressive_muscle_relaxation),
                            contentDescription = null,
                            modifier = Modifier
                                .width(200.dp)
                                .height(150.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            "Progresive Muscle Relaxation",
                            color = MaterialTheme.colors.secondary,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 15.sp,
                            ),
                            modifier = Modifier.width(200.dp)
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Practitioners start at one end of their body, usually their feet and work through the whole body. Often need to tense & relax muscles or to visualize a drifting wave over their body.",
                            color = MaterialTheme.colors.background,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp,
                            ),
                            modifier = Modifier.width(200.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        /*Button click to get started*/
                        Column(
                            modifier = Modifier.width(250.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            val url = "https://www.youtube.com/watch?v=TQ9kTYOwtks&t=66s"
                            val ctx = LocalContext.current
                            Button(
                                onClick = {
                                    Log.e("tag", url)
                                    val urlIntent = Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(url)
                                    )
                                    ctx.startActivity(urlIntent)
                                },
                                modifier = Modifier.padding(all = Dp(5F)),
                                enabled = true,
                                border = BorderStroke(
                                    width = 3.dp,
                                    brush = SolidColor(MaterialTheme.colors.primary)
                                ),
                                shape = MaterialTheme.shapes.medium,
                            )
                            {
                                Text(
                                    text = "Click here",
                                    style = TextStyle(
                                        fontSize = 13.sp,
                                    ),
                                    color = MaterialTheme.colors.onPrimary
                                )
                            }
                        }

                    }
                }
            }/*row 1 ends here*/

                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .border(
                                BorderStroke(
                                    2.dp,
                                    color = MaterialTheme.colors.secondary
                                )
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(5.dp)
                                .width(150.dp)
                                .fillMaxHeight()
                        ) {
                            Image(
                                painter = painterResource(R.drawable.mindfulness_meditation),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(150.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                "Mindfulness Meditation",
                                color = MaterialTheme.colors.secondary,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 15.sp,
                                ),
                                modifier = Modifier.width(200.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Mindfulness is a form of meditation that urges practitioners to remain aware and present in the moment. Rather than dwelling on the past or dreading the future, mindfulness encourages awareness of an individual’s present surroundings.",
                                color = MaterialTheme.colors.background,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                ),
                                modifier = Modifier.width(200.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            /*Button click to get started*/
                            Column(
                                modifier = Modifier.width(250.dp),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                val url = "https://www.youtube.com/watch?v=6p_yaNFSYao"
                                val ctx = LocalContext.current
                                Button(
                                    onClick = {
                                        Log.e("tag", url)
                                        val urlIntent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse(url)
                                        )
                                        ctx.startActivity(urlIntent)
                                    },
                                    modifier = Modifier.padding(all = Dp(5F)),
                                    enabled = true,
                                    border = BorderStroke(
                                        width = 3.dp,
                                        brush = SolidColor(MaterialTheme.colors.primary)
                                    ),
                                    shape = MaterialTheme.shapes.medium,
                                )
                                {
                                    Text(
                                        text = "Click here",
                                        style = TextStyle(
                                            fontSize = 13.sp,
                                        ),
                                        color = MaterialTheme.colors.onPrimary
                                    )
                                }
                            }

                        }
                    }

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .border(
                                BorderStroke(
                                    2.dp,
                                    color = MaterialTheme.colors.secondary
                                )
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(5.dp)
                                .width(150.dp)
                                .fillMaxHeight()
                        ) {
                            Image(
                                painter = painterResource(R.drawable.breath_awareness),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(150.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                "Breath Awareness Meditation",
                                color = MaterialTheme.colors.secondary,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 15.sp,
                                ),
                                modifier = Modifier.width(200.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text="It encourages mindful breathing. Practitioners breathe slowly and deeply, counting their breaths. The goal is to focus only on breathing and ignore other thoughts that enter the mind.",
                                color = MaterialTheme.colors.background,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                ),
                                modifier = Modifier.width(200.dp)
                            )
                            Spacer(modifier = Modifier.height(30.dp))
                            /*Button click to get started*/
                            Column(
                                modifier = Modifier.width(250.dp),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                val url = "https://www.youtube.com/watch?v=Eih7Pj8Mt_E"
                                val ctx = LocalContext.current
                                Button(
                                    onClick = {
                                        Log.e("tag", url)
                                        val urlIntent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse(url)
                                        )
                                        ctx.startActivity(urlIntent)
                                    },
                                    modifier = Modifier.padding(all = Dp(5F)),
                                    enabled = true,
                                    border = BorderStroke(
                                        width = 3.dp,
                                        brush = SolidColor(MaterialTheme.colors.primary)
                                    ),
                                    shape = MaterialTheme.shapes.medium,
                                )
                                {
                                    Text(
                                        text = "Click here",
                                        style = TextStyle(
                                            fontSize = 13.sp,
                                        ),
                                        color = MaterialTheme.colors.onPrimary
                                    )
                                }
                            }

                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                /*

            importance of medtiation

            */
                Text(
                    "IMPORTANCE OF MEDITATION",
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
                        painter = painterResource(R.drawable.benefits__2_),
                        contentDescription = null,
                        modifier = Modifier
                            .width(300.dp)
                            .height(300.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painter = painterResource(R.drawable.benefits__3_),
                        contentDescription = null,
                        modifier = Modifier
                            .width(300.dp)
                            .height(300.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painter = painterResource(R.drawable.benefits__1_),
                        contentDescription = null,
                        modifier = Modifier
                            .width(300.dp)
                            .height(300.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painter = painterResource(R.drawable.benefits__4_),
                        contentDescription = null,
                        modifier = Modifier
                            .width(300.dp)
                            .height(300.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                }
                Spacer(modifier = Modifier.height(10.dp))

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

