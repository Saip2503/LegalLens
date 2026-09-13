package com.legallens.domain

import kotlinx.serialization.Serializable

@Serializable
data class LegalAnalysis(
    val summary: String,
    val keyPoints: List<String> = emptyList(),
    val obligations: List<Obligation> = emptyList(),
    val risks: List<Risk> = emptyList(),
    val clauses: List<LegalClause> = emptyList(),
    val missingInformation: List<String> = emptyList()
)

@Serializable
data class Obligation(
    val title: String,
    val description: String,
    val source: SourceReference? = null
)

@Serializable
data class Risk(
    val title: String,
    val description: String,
    val severity: RiskSeverity,
    val source: SourceReference? = null
)

@Serializable
enum class RiskSeverity {
    INFORMATION,
    ATTENTION,
    POTENTIAL_RISK,
    HIGH_ATTENTION
}

@Serializable
data class LegalClause(
    val title: String,
    val explanation: String,
    val source: SourceReference? = null
)

@Serializable
data class SourceReference(
    val sectionId: String,
    val sectionNumber: String? = null,
    val pageNumber: Int? = null
)
