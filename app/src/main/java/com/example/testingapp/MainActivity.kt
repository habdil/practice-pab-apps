package com.example.testingapp

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import com.example.testingapp.data.Datasource
//import com.example.testingapp.ui.theme.TestingappTheme
//import com.example.testingapp.views.BehavioralView
//import com.example.testingapp.views.DessertClickerView
//import com.example.testingapp.views.DiceRollerScreen
//import com.example.testingapp.views.TipTapView
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        enableEdgeToEdge()
//        super.onCreate(savedInstanceState)
//        setContent {
//            TestingappTheme {
////                BehavioralView()
////                TipTapView()
//                DessertClickerView(desserts = Datasource.dessertList)
//            }
//        }
//    }
//}

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Surface
//import androidx.compose.ui.Modifier
//import com.example.testingapp.ui.GameScreen
//import com.example.testingapp.ui.theme.TestingappTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        enableEdgeToEdge()
//        super.onCreate(savedInstanceState)
//        setContent {
//            TestingappTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                ) {
//                    GameScreen()
//                }
//            }
//        }
//    }
//}

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.testingapp.ui.theme.TestingappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            TestingappTheme {
                CupcakeApp()
            }
        }
    }
}
