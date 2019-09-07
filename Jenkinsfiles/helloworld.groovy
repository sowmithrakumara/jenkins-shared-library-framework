@Library('dcube-library@master') _

pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
                echo "Hello World"
            }
    }
    }
}
