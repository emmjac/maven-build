# maven-build
for building a simple maven application


# Install Maven 
    -  sudo apt install -y maven

## verify Maven Version 
    - mvn -version


# Generate a Maven Project 
 Run the below command to generate a Web App project using the [maven-archetype-webapp](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html)
    - mvn archetype:generate -DgroupId=com.jjtech -DartifactId=JJtechBatchApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

    The above command will generate a standard maven project template for a simple Web application 

    ![alt text](image.png)