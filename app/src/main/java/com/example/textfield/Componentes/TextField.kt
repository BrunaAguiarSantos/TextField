package com.example.textfield.Componentes

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable

fun SimpleTextField(){
    var text by remember {  mutableStateOf("") }

    TextField(value = text, onValueChange ={}, label = { Text(text = "Nome")} )
    //Label = Mascara indicativa do que deve ser digitado no campo

}