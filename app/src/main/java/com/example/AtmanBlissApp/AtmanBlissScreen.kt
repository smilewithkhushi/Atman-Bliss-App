package com.example.cupcake

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.res.painterResource
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

@Composable
fun AtmanBlissScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.background(MaterialTheme.colors.onSecondary)
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .background(MaterialTheme.colors.onSecondary)
    ) {
        Row(

        ) {
            TopAppBar(
                title = { Text("Atman Bliss") },

                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Atman Bliss",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .padding(
                                top = 10.dp,
                                start = 10.dp
                            )
                    )
                }
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            Spacer(modifier = Modifier.height(55.dp))
            Image(
                painter = painterResource(R.drawable.homegraphic),
                contentDescription = null,
                modifier = Modifier.width(500.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                "Say Hi to your",
                color = MaterialTheme.colors.secondary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 25.sp,
                ),
                modifier = Modifier.width(500.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))

            val offset = Offset(5.0f, 10.0f)
            Text(
                "Self Care Buddy",
                color = MaterialTheme.colors.secondary,

                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 38.sp
                ),
                modifier = Modifier.width(400.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick =
                    {
                        navController.navigate(Routes.OptionScreen.route)
                    },
                    modifier = Modifier.padding(all = Dp(5F)),

                    // below line is use to set or
                    // button as enable or disable.
                    enabled = true,

                    border = BorderStroke(
                        width = 3.dp,
                        brush = SolidColor(MaterialTheme.colors.primary)
                    ),

                    // below line is use to add shape for our button.
                    shape = MaterialTheme.shapes.medium,
                )
                // below line is use to
                // add text on our button
                {
                    Text(
                        text = "Click to get started!",
                        style = TextStyle(
                            fontSize = 18.sp,
                        ),
                        color = MaterialTheme.colors.onPrimary
                    )
                }
            }
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
