# NotesDB
Notes saved in database

++++++++++++++++++++++++++++++++
Compose Compiler Gradle https://developer.android.com/develop/ui/compose/compiler

path-to-project-folder\NotesDB\gradle\libs.versions.toml
[versions]
kotlin = "2.0.0"
[plugins]
// Add this line
compose-compiler = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }

path-to-project-folder\NotesDB\build.gradle.kts
plugins {
// Add this line
alias(libs.plugins.compose.compiler) apply false

In every Module
path-to-project-folder\NotesDB\app\build.gradle.kts
plugins {
// Add this line
alias(libs.plugins.compose.compiler)

path-to-project-folder\NotesDB\otherModule\build.gradle.kts
plugins {
// Add this line
alias(libs.plugins.compose.compiler)

++++++++++++++++++++++++++++++++
kotlin Room with KAPT https://developer.android.com/jetpack/androidx/releases/room

path-to-project-folder\NotesDB\gradle\libs.versions.toml
[versions]
room = "2.6.1"
[libraries]
// Add this line
room-runtime = { module = "androidx.room:room-runtime", version.ref = "room" }
room-compiler = { module = "androidx.room:room-compiler", version.ref = "room" }

path-to-project-folder\NotesDB\app\build.gradle.kts
dependencies {
// Add this lines and Comment must be necessarily added too!
implementation(libs.room.runtime)
//noinspection KaptUsageInsteadOfKsp
kapt(libs.room.compiler)

++++++++++++++++++++++++++++++++
lifecycle.viewmodel.compose https://developer.android.com/jetpack/androidx/releases/lifecycle

path-to-project-folder\NotesDB\gradle\libs.versions.toml
[versions]
lifecycleExtensions = "2.8.4"
[libraries]
// Add this line
androidx-lifecycle-viewmodel-compose = { module = "androidx.lifecycle:lifecycle-viewmodel-compose", version.ref = "lifecycleExtensions" }

path-to-project-folder\NotesDB\app\build.gradle.kts
dependencies {
// Add this lines
implementation(libs.androidx.lifecycle.viewmodel.compose)