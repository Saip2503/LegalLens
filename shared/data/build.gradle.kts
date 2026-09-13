plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinSerialization)
}

kotlin {
    jvm()
    js { browser() }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":shared:core"))
            implementation(project(":shared:domain"))

            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.content.negotiation)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}