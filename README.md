
# spring-boot-swagger
This project is an example where the rest api are documented using the swagger library of springfox. The full docimentation of the library is available in [springfox web site
](http://springfox.github.io/springfox/)

## Configuration
In order to integrate the library in the project, two dependencies have to be added to the pom file:

     <dependency>  
       <groupId>io.springfox</groupId>  
       <artifactId>springfox-swagger2</artifactId>  
       <version>2.7.0</version>  
    </dependency>  
    <dependency>  
       <groupId>io.springfox</groupId>  
       <artifactId>springfox-swagger-ui</artifactId>  
       <version>2.7.0</version>  
    </dependency>

Then, a configuration file named `SwaggerConfig.java`to initialize the `Docket` object
