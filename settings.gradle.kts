fun includeProject(name: String, filePath: String? = null) {
    settings.include(name)
    val project = project(name)
    project.configureProjectDir(filePath)
    project.configureBuildFileName(name)
}

fun ProjectDescriptor.configureProjectDir(filePath: String? = null) {
    if (filePath != null) {
        projectDir = File(rootDir, filePath)
    }
    if (!projectDir.exists()) {
        throw GradleException("Path: $projectDir does not exist. Cannot include project: $name")
    }
    if (!projectDir.isDirectory) {
        throw GradleException("Path: $projectDir is a file instead of a directory. Cannot include project: $name")
    }
}

fun ProjectDescriptor.configureBuildFileName(projectName: String) {
    val name = projectName.substringAfterLast(":")

    /**
     * This is mainly to account for sub modules that utilize name spacing to have shorter module/gradle names.
     *
     * So for example if you have an 'entity' module defined in :foundation:entity and you have a :testing module defined
     * within :entity, you can have your gradle/kts file be named either :testing.gradle/kts or :entity-testing.gradle/kts
     */
    val secondToLastIndex = lastOrdinalIndexOf(projectName, ':', 2)
    val lastIndex = lastOrdinalIndexOf(projectName, ':', 1)
    val directParentModule = projectName.substring(secondToLastIndex, lastIndex).trim(':')

    buildFileName = "$name.gradle"

    if (!buildFile.exists()) {
        buildFileName = "$name.gradle.kts"
    }

    if (!buildFile.exists()) {
        buildFileName = "$directParentModule-$name.gradle"
    }

    if (!buildFile.exists()) {
        buildFileName = "$directParentModule-$name.kts"
    }

    if (!buildFile.exists()) {
        buildFileName = "build.gradle"
    }

    if (!buildFile.exists()) {
        throw GradleException("Build file: build.gradle, $name.gradle/kts, or $directParentModule-$name.gradle/kts does not exist. Cannot include project: $name")
    }
}

/**
 * Finds the n-th last index within a String
 */
fun lastOrdinalIndexOf(string: String, searchChar: Char, ordinal: Int): Int {
    val numberOfOccurrences = string.count { it == searchChar }

    if(numberOfOccurrences <= ordinal) {
        // the amount of times this character occurs is less than the ordinal you want, returning 0
        return 0
    }
    var found = 0
    var index = string.length
    do {
        index = string.lastIndexOf(searchChar, index - 1)
        if (index < 0) {
            return index
        }
        found++
    } while (found < ordinal)
    return index
}

includeProject(":app")
includeProject(":theme")
includeProject(":design")
includeProject(":foundation:navigation")
includeProject(":feature:home")
includeProject(":feature:feed")
includeProject(":feature:schedule")
includeProject(":feature:standings")
includeProject(":feature:settings")
includeProject(":primitives:data")
includeProject(":primitives:formulas")
includeProject(":primitives:networking-data")
includeProject(":primitives:buildconfig")
includeProject(":foundation:base")
includeProject(":foundation:initialization")
includeProject(":foundation:preferences")
includeProject(":repository:networking")
includeProject(":repository:networking-api")
includeProject(":repository:storage")
includeProject(":repository:storage-api")
includeProject(":repository:repository-impl")
includeProject(":dev-tools:dev-tools-impl")