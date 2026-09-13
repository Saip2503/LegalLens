package com.legallens.data

import com.legallens.domain.LegalDocument
import com.legallens.domain.AnalysisResult

interface LegalAiService {
    suspend fun analyzeDocument(document: LegalDocument): AnalysisResult
    suspend fun askQuestion(document: LegalDocument, question: String): String
    suspend fun compareDocuments(docA: LegalDocument, docB: LegalDocument): String
}
