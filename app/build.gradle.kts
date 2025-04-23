plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.raleighmasjid.iarkhateebtimer"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.raleighmasjid.iarkhateebtimer"
        minSdk = 27
        targetSdk = 35
        versionCode = 1
        versionName = "v1.2.2025_04_23"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    //implementation("com.android.support:appcompat-v7:25.3.1")
    implementation("org.jsoup:jsoup:1.10.3")
    implementation("org.apache.commons:commons-lang3:3.0")
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}