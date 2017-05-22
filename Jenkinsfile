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
  }
}