package com.legallens.data.repository

import com.legallens.core.AppResult
import com.legallens.data.model.AskQuestionRequest
import com.legallens.data.model.CompareDocumentsRequest
import com.legallens.data.model.ComparisonResult
import com.legallens.data.model.DocumentAnalysisResponse
import com.legallens.data.model.DocumentUploadResponse
import com.legallens.data.model.LegalAnswerResponse

interface LegalRepository {

    suspend fun uploadDocument(
        filename: String,
        content: ByteArray
    ): AppResult<DocumentUploadResponse>

    suspend fun analyzeDocument(
        documentId: String
    ): AppResult<DocumentAnalysisResponse>

    suspend fun askQuestion(
        documentId: String,
        request: AskQuestionRequest
    ): AppResult<LegalAnswerResponse>

    suspend fun compareDocuments(
        request: CompareDocumentsRequest
    ): AppResult<ComparisonResult>
}
