package com.legallens.domain

import kotlinx.serialization.Serializable

@Serializable
data class LegalDocument(
    val id: String,
    val name: String,
    val documentType: DocumentType = DocumentType.UNKNOWN,
    val jurisdiction: String? = null,
    val sections: List<DocumentSection> = emptyList()
)

@Serializable
data class DocumentSection(
    val id: String,
    val title: String?,
    val content: String,
    val pageNumber: Int? = null,
    val sectionNumber: String? = null
)
