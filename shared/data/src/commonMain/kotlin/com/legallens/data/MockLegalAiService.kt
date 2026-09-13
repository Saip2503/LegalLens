package com.legallens.data

import com.legallens.domain.LegalDocument
import com.legallens.domain.AnalysisResult
import com.legallens.domain.Clause

class MockLegalAiService : LegalAiService {
    override suspend fun analyzeDocument(document: LegalDocument): AnalysisResult {
        return AnalysisResult(
            summary = "This is a full plain-language executive summary of the agreement. It outlines the core intent, key milestones, and termination protocols.",
            clauses = listOf(
                Clause(
                    title = "Confidentiality Obligation",
                    content = "The employee must maintain confidentiality indefinitely regarding proprietary code and client lists.",
                    riskLevel = "Attention",
                    explanation = "An indefinite duration for a low-level or standard employee might be overly broad in some jurisdictions.",
                    sourceSection = "Section 8.2"
                )
            ),
            risks = listOf("⚠ Broad Intellectual Property assignment applies to non-work hours creations.", "⚠ Notice period is asymmetrical: 90 days for employee, 30 days for employer."),
            checklist = listOf("☐ Check governing law jurisdiction validity.", "☐ Verify notice period clauses match local state labor regulations."),
            lawyerQuestions = listOf("1. Is the indefinite survival of the confidentiality clause enforceable here?", "2. Can we reduce the non-compete radius from 50 miles to a smaller area?")
        )
    }

    override suspend fun askQuestion(document: LegalDocument, question: String): String {
        return "Based on Section 12, the notice period required for termination by either party is 60 days in writing. No immediate termination without cause is specified."
    }

    override suspend fun compareDocuments(docA: LegalDocument, docB: LegalDocument): String {
        return "Comparison matrix shows Document A has a 30-day notice period while Document B has a 60-day notice period. Document B includes non-solicitation clauses not found in Document A."
    }
}
