plugin{
    `kotlin-dsl`
}

group ="com.calebetadeu.convention.buildlogic"

dependencies{
    // Import the BOM for Compose
    implementation(platform(libs.compose.bom))

    // Compose dependencies
    implementation(libs.bundles.compose)

    // Android dependencies
    implementation(libs.bundles.android)

    // Koin for dependency injection
    implementation(libs.koin.core)
    implementation(libs.koin.compose)

    // Coroutines for asynchronous programming
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    // Testing dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.bundles.compose.test)
}

java{
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin{
    compilerOptions{
        jvmTarget = JvmTarget.JVM_17
    }
}