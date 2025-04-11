def call(String status) {
    def subject = "Jenkins Build ${status}: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
    def body = "Build status: ${status}\n" +
               "Project: ${env.JOB_NAME}\n" +
               "Build Number: ${env.BUILD_NUMBER}\n" +
               "URL: ${env.BUILD_URL}"

    echo "Sending Email notification: ${subject}"

    emailext(
        subject: subject,
        body: body,
        to: 'shrivastavav090@gmail.com'
    )
}
