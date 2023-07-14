pipeline {
    agent any
    
    stages {
        stage('Execute Python Script') {
            steps {
                script {
                    // Run the Python script and capture the output
                    def output = sh(script: 'python3 script.py', returnStdout: true).trim()
                    
                    // Print the captured output
                    echo "Python script output:\n${output}".split('\n')[1]
                }
            }
        }
    }
}