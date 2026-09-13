plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

kotlin {
    jvm()
    js { browser() }
    
    sourceSets {
        commonMain.dependencies {
            implementation(project(":shared:core"))
        }
    }
}