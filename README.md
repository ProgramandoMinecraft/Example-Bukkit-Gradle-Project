# Example Bukkit Project with Gradle

## Configuration
1. Change the project name in the [settings.gradle](settings.gradle) file
2. Change the project group and version in the [build.gradle](build.gradle) files
3. You may also configure commands permissions in the `build.gradle` with [this information](https://github.com/Minecrell/plugin-yml/blob/master/README.md)
4. Make sure to reference your plugin class and the Bukkit's API version in the `build.gradle` file as shown in this example
5. When you are ready, execute in shell/command prompt: `gradlew build` to create the jar file
6. Your jar file will be available in the `build/libs` directory
