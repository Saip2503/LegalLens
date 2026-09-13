package com.legallens.domain

data class LegalDocument(
    val id: String,
    val name: String,
    val text: String,
    val type: String,
    val jurisdiction: String
)

data class Clause(
    val title: String,
    val content: String,
    val riskLevel: String,
    val explanation: String,
    val sourceSection: String
)

data class AnalysisResult(
    val summary: String,
    val clauses: List<Clause>,
    val risks: List<String>,
    val checklist: List<String>,
    val lawyerQuestions: List<String>
)
