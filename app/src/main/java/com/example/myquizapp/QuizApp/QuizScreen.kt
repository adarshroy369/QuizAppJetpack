package com.example.myquizapp.QuizApp

import android.widget.ProgressBar
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myquizapp.R




object QuizDestination : NavigationDestination1 {
    override val route = "Quiz"
    override val titleRes = R.string.quiz_name

}



@Composable
fun QuizScreen(navigateBack: () -> Unit){

    val currentQuestionIndex = remember{ mutableStateOf(0) }
    val selectedAnswerIndex = remember {
        mutableStateOf(-1) }
    val isAnswerCorrect = remember {
        mutableStateOf(false)
    }
    val isAnswerSelected = selectedAnswerIndex.value != -1


val isLastQuestion = currentQuestionIndex.value == questions.size - 1
val isAllAnswerCorrect = remember {
    mutableStateOf(false)
}

val correctAnswerCount = remember {
    mutableStateOf(0)
}

    val selectedAnswerOptions = answerOptions[currentQuestionIndex.value]


    val correctAnswer = correctAnswers[currentQuestionIndex.value]


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

ProgressBar(currentQuestionIndex = currentQuestionIndex.value)


        Spacer(modifier = Modifier.height(32.dp))



        Text(text = "Correct Answers : ${correctAnswerCount.value}",
        modifier = Modifier.padding(bottom = 16.dp),
        textAlign = TextAlign.Center,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold)





        Spacer(modifier = Modifier.height(32.dp))



        Text(text = questions[currentQuestionIndex.value],
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)


        Spacer(modifier = Modifier.height(64.dp))



        selectedAnswerOptions.forEachIndexed { index, answer ->
            Button(onClick = {selectedAnswerIndex.value = index
                isAnswerCorrect.value = index == correctAnswer },

                modifier= Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .height(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White
                ),
                contentPadding = PaddingValues(12.dp)){

                Text(text = answer,
                modifier= Modifier.fillMaxSize(),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 14.sp
                ))
            }

        }



        Spacer(modifier = Modifier.height(64.dp))



        if(isAnswerSelected){
            if (isAnswerCorrect.value) {
                if (isLastQuestion) {
                    isAllAnswerCorrect.value = true
                } else {
                    currentQuestionIndex.value++
                    selectedAnswerIndex.value = -1
                    correctAnswerCount.value++

                }

            } else
                {
                    AlertDialog(onDismissRequest = { },
                    title = { Text(text = "Incorrect!")},
                        text = {
                            Column() {
                                Text(text = "Your answer is incorrect. Try again!")
                                Text(text = "Correct Answer: ${correctAnswerCount.value}")
                            }
                        },
                        confirmButton = {
                            Button(onClick = { currentQuestionIndex.value = 0 
                            selectedAnswerIndex.value = -1
                                correctAnswerCount.value = 0
                            
                            
                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(
                                contentColor = Color.White
                            )) {
                                Text(text = "retry")
                            }
                        }
                    ) 
                    
                    
                    
                }
            }
        
        
        
        if (isAllAnswerCorrect.value){
            AlertDialog(onDismissRequest = { },
            title = { Text(text = "Congratulations!")},
            text = { Text(text = "You have answeres all questions correctly")},
            confirmButton = {
                Button(onClick = {  currentQuestionIndex.value = 0
                    selectedAnswerIndex.value = -1
                    isAllAnswerCorrect.value = false },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White
                )
                ) {
                  Text(text = "play again")
                }
            }
                )















        
        
        }



        @Composable
        fun ProgressBar(
            currentQuestionIndex: Int
        ) {
            LinearProgressIndicator(
                progress = (currentQuestionIndex + 1).toFloat() / questions.size,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
        }















    }



}

fun ProgressBar(currentQuestionIndex: Int) {

}

