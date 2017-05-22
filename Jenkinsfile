pipeline {
  agent any
  stages {
    stage('composer install') {
      steps {
        echo 'so composer'
      }
    }
    stage('run php script') {
      steps {
        sh 'php ./bottle.php '
      }
    }
    stage('ping') {
      steps {
        sh 'ping -c 20 8.8.8.8'
      }
    }
  }
}