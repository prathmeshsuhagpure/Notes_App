// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    repositories {
        google()
    }

    dependencies {

        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
    }

}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.google.devtools.ksp") version "2.0.20-1.0.24" apply false
    id("com.android.library") version "7.3.1" apply false
}