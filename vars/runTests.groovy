def call() {
    echo "Running tests on the Maven project..."
    
    sh "mvn test"
}