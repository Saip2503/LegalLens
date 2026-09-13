package com.legallens.data.model

import kotlinx.serialization.Serializable

@Serializable
data class AskQuestionRequest(
    val question: String
)

@Serializable
data class CompareDocumentsRequest(
    val firstDocumentId: String,
    val secondDocumentId: String
)
