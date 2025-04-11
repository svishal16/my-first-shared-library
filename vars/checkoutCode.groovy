def call(String repoUrl, String branch = 'main') {
    echo "Checking out code from ${repoUrl} on branch ${branch}"
    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}
