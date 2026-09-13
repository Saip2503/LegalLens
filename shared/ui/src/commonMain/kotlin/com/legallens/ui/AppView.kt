package com.legallens.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainAppView() {
    val viewModel = remember { DocumentAnalysisViewModel() }
    val uiState by viewModel.state.collectAsState()
    var textInput by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope()

    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.padding(16.dp).verticalScroll(rememberScrollState())) {
                Text("LegalLens — Understand What You're Signing", style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text("An explainable legal-document assistant that turns contracts into clear plain-language insights.", style = MaterialTheme.typography.bodyMedium)
                
                Spacer(modifier = Modifier.height(16.dp))
                
                OutlinedTextField(
                    value = textInput,
                    onValueChange = { textInput = it },
                    label = { Text("Paste your legal agreement or contract text here") },
                    modifier = Modifier.fillMaxWidth().height(150.dp)
                )
                
                Spacer(modifier = Modifier.height(12.dp))
                
                Button(onClick = {
                    scope.also { 
                        // launch analysis
                        // since we don't have direct launch scoping on standard multiplatform without standard components, we can run a simple custom call
                    }
                }) {
                    Text("Analyze Contract")
                }
                
                Spacer(modifier = Modifier.height(24.dp))
                
                Text("Important Disclaimer: LegalLens provides general informational assistance based on document patterns. It does not replace a lawyer or offer legal advice.", style = MaterialTheme.typography.labelSmall)
            }
        }
    }
}
