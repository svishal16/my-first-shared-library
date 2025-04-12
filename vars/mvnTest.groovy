def call(){
    withEnv(['MAVEN_OPTS=--add-opens jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED']){
        sh 'mvn test'
    }
}
