# Maven Lifecycle Demo - Hello World

This project demonstrates the complete Maven lifecycle with a simple Hello World Java application.

## Maven Lifecycle Phases

The Maven lifecycle consists of the following phases (executed in order):

### 1. **Validate**
   - Validates that the project structure is correct
   - Checks that all required files are present
   - Command: `mvn validate`

### 2. **Compile**
   - Compiles the source code
   - Located in: `src/main/java`
   - Output: `target/classes`
   - Command: `mvn compile`

### 3. **Test**
   - Runs unit tests
   - Test files: `src/test/java`
   - Test runner: Maven Surefire Plugin
   - Command: `mvn test`

### 4. **Package**
   - Packages the compiled code into JAR file
   - Output: `target/maven-lifecycle-demo-1.0.0.jar`
   - Command: `mvn package`

### 5. **Integration Test**
   - Runs integration tests
   - Test files: `src/test/java/*IT.java`
   - Test runner: Maven Failsafe Plugin
   - Command: `mvn integration-test`

### 6. **Verify**
   - Checks that the package is valid and meets quality criteria
   - Runs failsafe verify goal
   - Command: `mvn verify`

### 7. **Install**
   - Installs the package into local Maven repository
   - Location: `~/.m2/repository`
   - Command: `mvn install`

### 8. **Deploy**
   - Deploys the package to a remote repository
   - Requires repository configuration in pom.xml
   - Command: `mvn deploy`

## Project Structure

```
mavenLifecycleDemo/
├── pom.xml                           # Maven configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           └── HelloWorld.java   # Main application
│   └── test/
│       └── java/
│           └── com/example/
│               ├── HelloWorldTest.java   # Unit tests
│               └── HelloWorldIT.java     # Integration tests
└── target/                           # Build output directory
```

## How to Run

### Run Full Lifecycle
```bash
# This runs all phases: validate → compile → test → package → integration-test → verify → install
mvn clean install
```

### Run Specific Phases
```bash
# Validate
mvn validate

# Compile only
mvn compile

# Run tests
mvn test

# Package
mvn package

# Run integration tests
mvn integration-test

# Verify
mvn verify

# Install to local repository
mvn install

# Deploy (requires repository configuration)
mvn deploy
```

### Run the Application
```bash
# After packaging
java -jar target/maven-lifecycle-demo-1.0.0.jar

# Or compile and run directly
mvn exec:java -Dexec.mainClass="com.example.HelloWorld"
```

## Output Example

When you run `mvn clean install`, you'll see output like:

```
[INFO] --- maven-compiler-plugin:3.11.0:compile (default-compile) @ maven-lifecycle-demo ---
[INFO] --- maven-surefire-plugin:3.0.0-M9:test (default-test) @ maven-lifecycle-demo ---
[INFO] --- maven-jar-plugin:3.3.0:jar (default-jar) @ maven-lifecycle-demo ---
[INFO] --- maven-failsafe-plugin:3.0.0-M9:integration-test (default) @ maven-lifecycle-demo ---
[INFO] --- maven-install-plugin:3.1.1:install (default-install) @ maven-lifecycle-demo ---
```

## Requirements

- Java 11 or higher
- Maven 3.6.0 or higher

## Dependencies

- JUnit 4.13.2 (for testing)

## License

This project is provided as-is for educational purposes.
