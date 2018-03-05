# Sample project demonstrating Swagger code generation

### How to generate .yaml API file 

1. ```cd``` to the root of the project.
2. Make sure that ```/target``` directory doesn't exist. If it's present, delete it.
3. Run the following commands:
    - ```mvn clean```
    - ```mvn compile```
    - ```mvn swagger:generate```

Now your ```swagger.yaml``` file is generated under ```/generated/swagger-ui/```. Format and properties of the API file can be configured in ```pom.xml```.