# Sandbox App

Sandbox App is a sample Android application demonstrating the use of Jetpack Compose for building UIs, alongside a simple implementation of navigation and view models. The app showcases a list of characters, and upon selecting a character, displays details about the character along with a list of episodes they appear in. Clicking on an episode navigates to a screen displaying episode details.

## Features

- Display a list of characters.
- Show character details including a list of episodes.
- Navigate to episode details screen.
- Play sound and vibrate on episode card click.

## Screens

### Characters Screen

Displays a list of characters.

### Character Details Screen

Shows details of a selected character including their first name, last name, and a list of episodes they appear in.

### Episode Details Screen

Displays details of a selected episode including the episode name and date.

## Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- Kotlin 1.5.21 or later

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/OrbSephi/sandbox-app.git
    cd sandbox-app
    ```

2. Open the project in Android Studio.

3. Build the project to download all necessary dependencies.

### Project Structure

The project structure is as follows:

- `ui/screens/characters` - Contains the `CharactersScreen` composable.
- `ui/screens/characterdetails` - Contains the `CharacterDetailsScreen` composable and its ViewModel.
- `ui/screens/episodedetails` - Contains the `EpisodeDetailsScreen` composable and its ViewModel.
- `navigation` - Contains the `AppNavHost` composable which manages navigation between screens.
- `data` - Contains the repository implementations and data models.
- `utils` - Contains utility functions such as `playSound` and `vibratePhone`.

### Dependencies

Dependencies are managed using Gradle. Here's an example of dependencies defined in `build.gradle.kts`:

```kotlin
dependencies {
    // Core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // UI
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.material3)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Dependency not used, just here for evaluation
    implementation(libs.bundles)
}
