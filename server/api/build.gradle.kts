plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
}

dependencies {
    implementation(project(":shared:domain"))
    implementation(libs.ktor.serverCore)
    implementation(libs.ktor.serverNetty)
    implementation(libs.logback)
}

application {
    mainClass.set("com.legallens.ApplicationKt")
}
