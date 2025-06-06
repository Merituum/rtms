plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.cellsignalinfo"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.cellsignalinfo"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    buildToolsVersion = "35.0.0"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation("org.osmdroid:osmdroid-android:6.1.18")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1") // dla AppCompatActivity
    implementation("com.google.android.material:material:1.10.0")
    implementation("org.osmdroid:osmdroid-android:6.1.18")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("androidx.preference:preference-ktx:1.2.1") // dla PreferenceManager
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.12.0")
    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0") // Sprawdź najnowszą wersję Retrofit
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Konwerter Gson dla Retrofit [2]

    // Gson (jeśli nie jest automatycznie dołączony przez konwerter, choć zazwyczaj jest)
    implementation("com.google.code.gson:gson:2.10.1") // Sprawdź najnowszą wersję Gson [3]

    // Coroutines dla operacji asynchronicznych
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") // Sprawdź najnowszą wersję
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")


}