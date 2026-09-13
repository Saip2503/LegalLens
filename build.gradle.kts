plugins {
    kotlin("multiplatform") version "2.2.20" apply false
    kotlin("jvm") version "2.2.20" apply false
    kotlin("plugin.serialization") version "2.2.20" apply false

    id("org.jetbrains.compose") version "1.9.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.20" apply false

    id("io.ktor.plugin") version "3.3.0" apply false
}