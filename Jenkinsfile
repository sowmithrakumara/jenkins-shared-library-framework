    
@Library('dcube-library@master') _

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                gitCheckout(
                branch: "master",
                url: "https://github.com/sowmithrakumara/jenkins-shared-library-framework.git"
                )
            }
        }
    }
}
