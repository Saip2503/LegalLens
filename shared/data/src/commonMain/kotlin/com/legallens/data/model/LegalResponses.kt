package com.legallens.data.model

import com.legallens.domain.LegalAnalysis
import com.legallens.domain.LegalDocument
import com.legallens.domain.SourceReference
import kotlinx.serialization.Serializable

@Serializable
data class DocumentUploadResponse(
    val documentId: String,
    val filename: String,
    val status: DocumentStatus
)

@Serializable
enum class DocumentStatus {
    PROCESSING,
    READY,
    FAILED
}

@Serializable
data class DocumentAnalysisResponse(
    val document: LegalDocument,
    val analysis: LegalAnalysis
)

@Serializable
data class LegalAnswerResponse(
    val answer: String,
    val confidence: AnswerConfidence,
    val sources: List<SourceReference> = emptyList()
)

@Serializable
enum class AnswerConfidence {
    HIGH,
    MEDIUM,
    LOW,
    UNKNOWN
}
