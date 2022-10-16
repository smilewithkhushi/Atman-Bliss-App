package com.example.cupcake

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
import androidx.navigation.NavHostController
import androidx.compose.material.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.graphics.SolidColor
import com.example.cupcake.ui.Routes

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.text.font.FontWeight.Companion.Bold

@Composable
fun Music(navController: NavHostController) {
        Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        Row() {
            TopAppBar(
                title = { Text("Explore Atman Bliss") },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(Routes.OptionScreen.route)
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
/*Music */
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Spacer(modifier = Modifier.height(460.dp))
            Image(
                painter = painterResource(R.drawable.selfcare1),
                contentDescription = null,
                modifier = Modifier
                    .width(300.dp)
                    .height(200.dp)
            )
            Text(
                "MUSIC",
                color = MaterialTheme.colors.primaryVariant,
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
                        navController.navigate(Routes.Music.route)
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
                        text = "Music to heal your soul",
                        style = TextStyle(
                            fontSize = 15.sp,
                        ),
                        color = MaterialTheme.colors.onPrimary
                    )
                }
            }
        }


    }

}
