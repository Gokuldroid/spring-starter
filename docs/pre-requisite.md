#### Local setup

- Install intellij IDEA CE from [here](https://download-cf.jetbrains.com/idea/ideaIC-2020.1.1.dmg).

*why we need and IDE:*

Unlike ruby, java has strong type system that gives a huge advantage for IDE to provide suggestions auto completions. Intellij IDEA gives out of the box configurations for mvn or gradle based applications.

- Install JDK for [here](https://adoptopenjdk.net/)

Good thing to know [JDK vs JRE - 1](https://www.journaldev.com/546/difference-jdk-vs-jre-vs-jvm), [JDK vs JRE - 2](https://stackoverflow.com/questions/1906445/what-is-the-difference-between-jdk-and-jre)

**JVM** = Class loader system + runtime data area + Execution Engine.
**JRE** = JVM + Java Packages Classes(like util, math, lang, awt,swing etc)+runtime libraries.
**JDK** = JRE + Development/debugging tools

JVM < JRE < JDK

to check java is installed correctly via cmdline

```bash
java -version
```

this should output something like this,

```bash
openjdk version "11.0.7" 2020-04-14
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)
```

- download spring starter from [here](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.3.0.RELEASE&packaging=jar&jvmVersion=11&groupId=lily.potter&artifactId=example&name=example&description=Demo%20project%20for%20Spring%20Boot&packageName=lily.potter.example&dependencies=devtools,data-rest,flyway,lombok,postgresql)

It will give you a zip file. extract it and intellij IDEA select open project -> select the extracted folder


#### Start server in local

```bash
./mvnw spring-boot:run
```

#### Postman request collections

You can download postman request collections form [here](https://www.getpostman.com/collections/ef8c1a11c1258825b34a)