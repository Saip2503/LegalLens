package com.legallens.domain

import kotlinx.serialization.Serializable

@Serializable
enum class DocumentType {
    EMPLOYMENT_AGREEMENT,
    RENTAL_AGREEMENT,
    NON_DISCLOSURE_AGREEMENT,
    SERVICE_AGREEMENT,
    LOAN_AGREEMENT,
    PRIVACY_POLICY,
    TERMS_OF_SERVICE,
    OTHER,
    UNKNOWN
}
