def newGit()
{
   git credentialsId: 'c8936680-f9d6-41b2-acb9-b9aee024f3f3', url: 'https://github.com/intelliqittrainings/maven.git'
}

def newBuild()
{
   sh 'mvn package'
}

def newDeployment()
{
   deploy adapters: [tomcat9(credentialsId: '477ac95a-01e5-4db3-b6ed-beac3a63d586', path: '', url: 'http://172.31.41.160:8080')], contextPath: 'testapp1', war: '**/*.war'
}

def newTesting()
{
   git credentialsId: 'c8936680-f9d6-41b2-acb9-b9aee024f3f3', url: 'https://github.com/intelliqittrainings/FunctionalTesting.git'
      sh 'java -jar /var/lib/jenkins/workspace/Scriptedpipeline1/testing.jar'
}
