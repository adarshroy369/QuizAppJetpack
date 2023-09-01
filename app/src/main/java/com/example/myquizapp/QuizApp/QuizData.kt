package com.example.myquizapp.QuizApp

val questions= listOf(
    "What is the capital of Australia?",
    "Who wrote the play 'Hamlet'?",
    "Which planet is known as the 'Red Planet'?",
    "What is the largest country in South America?",
    "Who painted the famous artwork 'The Starry Night'?",
    "What is the chemical symbol for gold?",
    "Who is the author of the book 'To Kill a Mockingbird'?",
    "What is the tallest mountain in the world?",
    "What is the largest desert in the world?",
    "What is the top-selling car brand in the world?",
    "Which country is known for the Great Barrier Reef?",
    "Who wrote the novel '1984'?",
    "What is the largest planet in our solar system?",
    "What is the official language of Spain?",
    "Who is the author of the 'Lord of the Rings' trilogy?",
    "Which city is famous for the Colosseum?",
    "What is the national animal of Australia?",
    "Which country is famous for its tulip fields?",
    "Who is the Greek goddess of wisdom?",
    "What is the largest waterfall in the world?"
)


val answerOptions = listOf(
    listOf("Sydney", "Melbourne", "Canberra", "Perth"),                                 // Answer options for question 1
    listOf("William Shakespeare", "Arthur Miller", "Tennessee Williams", "George Bernard Shaw"),     // Answer options for question 2
    listOf("Mars", "Jupiter", "Venus", "Saturn"),                                         // Answer options for question 3
    listOf("Argentina", "Colombia", "Peru", "Brazil"),                                    // Answer options for question 4
    listOf("Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Edvard Munch"),     // Answer options for question 5
    listOf("Ag", "Cu", "Fe", "Au"),                                                        // Answer options for question 6
    listOf("Harper Lee", "Mark Twain", "F. Scott Fitzgerald", "J.D. Salinger"),           // Answer options for question 7
    listOf("K2", "Mount Everest", "Kangchenjunga", "Makalu"),                             // Answer options for question 8
    listOf("Gobi Desert", "Sahara Desert", "Arabian Desert", "Antarctic Desert"),         // Answer options for question 9
    listOf("Toyota", "Ford", "Volkswagen", "Honda"),                                          // Answer options for question 10
    listOf("Australia", "Mexico", "Brazil", "Thailand"),                          // Answer options for question 11
    listOf("Ernest Hemingway", "Aldous Huxley", "Ray Bradbury", "George Orwell"),  // Answer options for question 12
    listOf("Jupiter", "Saturn", "Neptune", "Uranus"),                              // Answer options for question 13
    listOf("English", "Spanish", "French", "Italian"),                             // Answer options for question 14
    listOf("C.S. Lewis", "George R.R. Martin",  "J.R.R. Tolkien", "J.K. Rowling"),   // Answer options for question 15
    listOf("Rome", "Athens", "Paris", "London"),                                    // Answer options for question 16
    listOf("Kangaroo", "Koala", "Platypus", "Emu"),                                 // Answer options for question 17
    listOf("Netherlands", "Belgium", "Switzerland", "Germany"),                     // Answer options for question 18
    listOf("Athena", "Aphrodite", "Hera", "Artemis"),                               // Answer options for question 19
    listOf("Angel Falls", "Niagara Falls", "Iguazu Falls", "Victoria Falls")        // Answer options for question 20
)





val correctAnswers = listOf(
    2,  // Tačan odgovor za pitanje 1 (Canberra)
    0,  // Tačan odgovor za pitanje 2 (William Shakespeare)
    0,  // Tačan odgovor za pitanje 3 (Mars)
    3,  // Tačan odgovor za pitanje 4 (Brazil)
    1,  // Tačan odgovor za pitanje 5 (Vincent van Gogh)
    3,  // Tačan odgovor za pitanje 6 (Au)
    0,  // Tačan odgovor za pitanje 7 (Harper Lee)
    1,  // Tačan odgovor za pitanje 8 (Mount Everest)
    1,  // Tačan odgovor za pitanje 9 (Sahara Desert)
    2,   // Tačan odgovor za pitanje 10 (Zeus)
    0,  // Correct answer for question 11 (Australia)
    3,  // Correct answer for question 12 (George Orwell)
    0,  // Correct answer for question 13 (Jupiter)
    1,  // Correct answer for question 14 (Spanish)
    2,  // Correct answer for question 15 (J.R.R. Tolkien)
    0,  // Correct answer for question 16 (Rome)
    1,  // Correct answer for question 17 (Koala)
    0,  // Correct answer for question 18 (Netherlands)
    0,  // Correct answer for question 19 (Athena)
    3   // Correct answer for question 20 (Victoria Falls)
)