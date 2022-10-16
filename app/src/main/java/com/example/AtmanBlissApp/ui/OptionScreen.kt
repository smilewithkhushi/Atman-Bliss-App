package com.example.cupcake

import android.content.Context
import android.content.Intent
import android.net.Uri
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.graphics.SolidColor
import com.example.cupcake.ui.Routes

import androidx.compose.material.MaterialTheme
import com.google.android.exoplayer2.util.Log

@Composable
fun OptionScreen(navController: NavHostController) {


    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .background(MaterialTheme.colors.onSecondary)
    ) {
        Row() {
            TopAppBar(
                title = { Text("Explore Atman Bliss") },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(Routes.AtmanBlissScreen.route)
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back_button)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "Atman Bliss",
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .padding(
                                    top = 10.dp,
                                    start = 800.dp,
                                    end = 10.dp
                                )
                        )
                    }
                }
            )
        }

/*  MEDITATION */
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(1.dp),
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            Text(
                "Atman Bliss is a Self Care App which aims to become your accompanist at physical, mental and spiritual level. ",
                color = MaterialTheme.colors.secondary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Justify,
                style = TextStyle(
                    fontSize = 18.sp,
                ),
                modifier = Modifier.width(310.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                "Feel Better. Sleep Better. Live Better.",
                color = MaterialTheme.colors.secondaryVariant,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 18.sp,
                ),
                modifier = Modifier.width(310.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(R.drawable.meditatedoodle),
                contentDescription = null,
                modifier = Modifier
                    .width(400.dp)
                    .background(MaterialTheme.colors.onSecondary),
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                "MEDITATION",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 25.sp,
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.width(300.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = {
                        navController.navigate(Routes.Meditation.route)
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
                        text = "One step towards mindfulness \uD83E\uDD0D",
                        style = TextStyle(
                            fontSize = 15.sp,
                        ),
                        color = MaterialTheme.colors.onPrimary
                    )
                }
            }
/*Music */
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(R.drawable.musiclisten),
                    contentDescription = null,
                    modifier = Modifier
                        .width(420.dp)
                        .height(300.dp)
                )
                Text(
                    "MUSIC",
                    color = MaterialTheme.colors.primary,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 25.sp,
                    ),
                    modifier = Modifier.width(200.dp)
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    // in the below line, we are creating
                    // variables for URL
                    val url = "https://open.spotify.com/playlist/4Fh0313D3PitYzICKHhZ7r?si=k6IdFmtwTGGCFAsvzOivTg"
                    val ctx = LocalContext.current
                    Button(

                        onClick =
                        {
                            Log.e("tag",url)
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
                            text = "Happy Vibes Only \uD83E\uDD0D ",
                            style = TextStyle(
                                fontSize = 15.sp,
                            ),
                            color = MaterialTheme.colors.onPrimary
                        )
                    }
                }
            }


/* MEMES */
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(R.drawable.happydoodle),
                    contentDescription = null,
                    modifier = Modifier
                        .width(400.dp)
                )
                Spacer(modifier = Modifier.height(1.dp))

                Text(
                    "MEMES",
                    color = MaterialTheme.colors.primary,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 25.sp,
                    ),
                    modifier = Modifier.width(200.dp)
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Button(
                        onClick =
                        {
                            navController.navigate(Routes.Memes.route)
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
                            text = "Daily Dose of Giggles \uD83E\uDD0D",
                            style = TextStyle(
                                fontSize = 15.sp,
                            ),
                            color = MaterialTheme.colors.onPrimary
                        )
                    }
                }
            }

            /*Productivity*/
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(R.drawable.work_new),
                    contentDescription = null,
                    modifier = Modifier
                        .width(380.dp)
                        .height(240.dp)
                )
                Spacer(modifier = Modifier.height(1.dp))

                Text(
                    "PRODUCTIVITY",
                    color = MaterialTheme.colors.primary,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 25.sp,
                    ),
                    modifier = Modifier.width(200.dp)
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Button(
                        onClick =
                        {
                            navController.navigate(Routes.Productivity.route)
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
                            text = "Focus! You're almost there \uD83E\uDD0D",
                            style = TextStyle(
                                fontSize = 15.sp,
                            ),
                            color = MaterialTheme.colors.onPrimary
                        )
                    }
                }
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    "Your Self Care Buddy is here to help you bring your mind and body into balance. So, the next time you feel a wave of anxiety or the weight of stress, you're one click away from a calmer state of mind",
                    color = MaterialTheme.colors.secondary,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 18.sp,
                    ),
                    modifier = Modifier.width(300.dp)
                )

                Spacer(modifier = Modifier.height(5.dp))

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
}
