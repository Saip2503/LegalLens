package com.legallens.core

sealed interface AppError {

    data object Network : AppError

    data object Unauthorized : AppError

    data object NotFound : AppError

    data object InvalidDocument : AppError

    data object AnalysisFailed : AppError

    data object InvalidResponse : AppError

    data object Unknown : AppError
}
