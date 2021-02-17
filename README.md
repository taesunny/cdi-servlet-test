It's a test project for servlet.

It's based on WildFly Example Project - https://github.com/wildfly/quickstart/tree/10.x/helloworld

## Tested Environment
- OpenJDK 11.0.9.1
- Windows 10
- Maven 3.6.3
- Wildfly 22.0.1

## Run Wildfly

- standalone example
  
```sh
# For Linux
$ WILDFLY_HOME/bin/standalone.sh

# For Windows
$ WILDFLY_HOME\bin\standalone.bat
```

## Deployment cmd

```sh
$ mvn clean install wildfly:deploy
```