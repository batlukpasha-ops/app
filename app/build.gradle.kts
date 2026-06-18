plugins {
    id("com.android.application")
}

android {
    namespace = "ru.practice.smartbasket"
    compileSdk = 37

    defaultConfig {
        applicationId = "ru.practice.smartbasket"
        minSdk = 23
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
