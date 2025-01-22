package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Onboarding (modifier: Modifier = Modifier) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }



    Column (
        modifier = Modifier.fillMaxWidth()
            .height(300.dp)
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(R.drawable.ic_launcher_background), contentDescription = "")
    }
    Column {
        Text(
            text = "Let's get to know you"
        )
        TextField(
            value = firstName, onValueChange = {firstName = it}
        )
        TextField(
            value = lastName, onValueChange = {lastName = it}
        )
        TextField(
            value = email, onValueChange = {email = it}
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = TODO(),
            modifier = TODO(),
            enabled = TODO(),
            shape = TODO(),
            colors = TODO(),
            elevation = TODO(),
            border = TODO(),
            contentPadding = TODO(),
            interactionSource = TODO()
        ) {
            Text(
                text = "Register"
            )
        }
    }
}

@Preview
@Composable
private fun OnboardingPreview() {
    Onboarding()
}