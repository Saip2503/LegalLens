package com.legallens.ui

import com.legallens.domain.AnalysisResult
import com.legallens.data.LegalAiService
import com.legallens.data.MockLegalAiService
import com.legallens.domain.LegalDocument
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

sealed interface AnalysisState {
    data object Idle : AnalysisState
    data object Processing : AnalysisState
    data class Success(val result: AnalysisResult) : AnalysisState
    data class Error(val message: String) : AnalysisState
}

class DocumentAnalysisViewModel {
    private val aiService: LegalAiService = MockLegalAiService()

    private val _state = MutableStateFlow<AnalysisState>(AnalysisState.Idle)
    val state: StateFlow<AnalysisState> = _state.asStateFlow()

    suspend fun analyze(text: String) {
        if (text.isBlank()) {
            _state.value = AnalysisState.Error("Document content cannot be empty.")
            return
        }
        _state.value = AnalysisState.Processing
        try {
            val doc = LegalDocument("doc_1", "Sample Contract", text, "Employment Agreement", "India")
            val res = aiService.analyzeDocument(doc)
            _state.value = AnalysisState.Success(res)
        } catch (e: Exception) {
            _state.value = AnalysisState.Error(e.message ?: "Unknown analysis error")
        }
    }
}
