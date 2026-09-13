package com.legallens.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ComparisonResult(
    val firstDocumentName: String,
    val secondDocumentName: String,
    val differences: List<ClauseDifference>
)

@Serializable
data class ClauseDifference(
    val category: String,
    val firstDocumentValue: String?,
    val secondDocumentValue: String?,
    val changeType: ChangeType,
    val explanation: String
)

@Serializable
enum class ChangeType {
    ADDED,
    REMOVED,
    CHANGED,
    SIMILAR,
    UNKNOWN
}
