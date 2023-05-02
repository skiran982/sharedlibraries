def newGit()
{
   git credentialsId: 'c8936680-f9d6-41b2-acb9-b9aee024f3f3', url: 'https://github.com/intelliqittrainings/maven.git'
}

def newBuild()
{
   sh 'mvn package'
}
