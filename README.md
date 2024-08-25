# NotesDB
Notes saved in database

++++++++++++++++++++++++++++++++<br>
Compose Compiler Gradle https://developer.android.com/develop/ui/compose/compiler

path-to-project-folder\NotesDB\gradle\libs.versions.toml<br>
[versions]<br>
&nbsp;&nbsp;&nbsp;&nbsp;kotlin = "2.0.0"<br>
[plugins]<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;compose-compiler = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }

path-to-project-folder\NotesDB\build.gradle.kts<br>
plugins {<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;alias(libs.plugins.compose.compiler) apply false

In every Module<br>
path-to-project-folder\NotesDB\app\build.gradle.kts<br>
plugins {<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;alias(libs.plugins.compose.compiler)

path-to-project-folder\NotesDB\otherModule\build.gradle.kts<br>
plugins {<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;alias(libs.plugins.compose.compiler)<br>

++++++++++++++++++++++++++++++++<br>
kotlin Room with KAPT https://developer.android.com/jetpack/androidx/releases/room

path-to-project-folder\NotesDB\gradle\libs.versions.toml<br>
[versions]<br>
&nbsp;&nbsp;&nbsp;&nbsp;room = "2.6.1"<br>
[libraries]<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;room-runtime = { module = "androidx.room:room-runtime", version.ref = "room" }<br>
&nbsp;&nbsp;&nbsp;&nbsp;room-ktx = { module = "androidx.room:room-ktx", version.ref = "room" }<br>
&nbsp;&nbsp;&nbsp;&nbsp;room-compiler = { module = "androidx.room:room-compiler", version.ref = "room" }

path-to-project-folder\NotesDB\app\build.gradle.kts<br>
dependencies {<br>
// Add this lines and Comment must be necessarily added too!<br>
&nbsp;&nbsp;&nbsp;&nbsp;implementation(libs.room.runtime)<br>
&nbsp;&nbsp;&nbsp;&nbsp;implementation(libs.room.ktx)<br>
&nbsp;&nbsp;&nbsp;&nbsp;//noinspection KaptUsageInsteadOfKsp<br>
&nbsp;&nbsp;&nbsp;&nbsp;kapt(libs.room.compiler)

++++++++++++++++++++++++++++++++<br>
lifecycle.viewmodel.compose https://developer.android.com/jetpack/androidx/releases/lifecycle

path-to-project-folder\NotesDB\gradle\libs.versions.toml<br>
[versions]<br>
&nbsp;&nbsp;&nbsp;&nbsp;lifecycleExtensions = "2.8.4"<br>
[libraries]<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;androidx-lifecycle-viewmodel-compose = { module = "androidx.lifecycle:lifecycle-viewmodel-compose", version.ref = "lifecycleExtensions" }

path-to-project-folder\NotesDB\app\build.gradle.kts<br>
dependencies {<br>
// Add this lines<br>
&nbsp;&nbsp;&nbsp;&nbsp;implementation(libs.androidx.lifecycle.viewmodel.compose)<br>
