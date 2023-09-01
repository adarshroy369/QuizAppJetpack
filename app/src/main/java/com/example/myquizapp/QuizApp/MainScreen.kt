package com.example.myquizapp.QuizApp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



object MainScreenDestination : NavigationDestination1 {
    override val route = "MainScreen"
    override val titleRes = com.example.myquizapp.R.string.mainScreen
}




@Composable
fun MainScreen(
    navigateToQuiz: () -> Unit
){
    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "MYQUIZAPP")},)

    },
    content = {
        Column(modifier= Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

            Image(
                painter = painterResource(id = com.example.myquizapp.R.drawable.ic_launcher_foreground),
                contentDescription = stringResource(id = com.example.myquizapp.R.string.image_content_description),
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(172.dp)
            )


            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Welcome to Quizzy!",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = Modifier.height(64.dp))

            Button(
                onClick = { navigateToQuiz() },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.White
                ),
                contentPadding = PaddingValues(12.dp)
            ) {
                Text(text = "Start Quizzy",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }


        }
    } )
}