plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.deadline"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.deadline"
        minSdk = 27
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    val nav_version = "2.7.7"

    // Java language implementation
    // noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-ui:$nav_version")
    // Kotlin
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    // Feature module Support
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")
    // Testing Navigation
    //noinspection UseTomlInstead
    androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")
    // Jetpack Compose Integration
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-compose:$nav_version")
    //noinspection UseTomlInstead
    implementation("com.google.firebase:firebase-database")
    //noinspection UseTomlInstead
    implementation(platform("com.google.firebase:firebase-bom:33.1.1"))
    //noinspection UseTomlInstead
    implementation("com.google.firebase:firebase-database:21.0.0")



}