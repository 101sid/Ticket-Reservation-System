pipeline {
    agent any

    tools {
        maven 'Maven 3.9' // This name must match your Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                // Pulls the latest code from your team's GitHub repository
                git branch: 'develop', url: 'https://github.com/101sid/Ticket-Reservation-System.git'
            }
        }

        stage('Build') {
            steps {
                // Compiles all the Java classes (Passenger, TicketClerk, etc.)
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Automatically runs the Unit Test cases developed for Question 4
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Packages the project into a JAR file for deployment
                sh 'mvn package'
            }
        }
    }
}