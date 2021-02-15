<p align="center">
  <a href="https://www.lagomframework.com/?utm_source=tiarebalbi-starter&utm_medium=readme&utm_campaign=tiarebalbi/lagom-starter-minimal">
    <img alt="Gatsby" src="https://scalac.io/wp-content/uploads/2019/02/lagom-logo.png" width="360" />
  </a>
</p>
<h1 align="center">
  Lagom minimal starter (scala)
</h1>

## 📜 Summary

This is a minimal version, not an empty version, so to help you with your first service an initial project called `core-api`
 and `core-impl` were created with a basic interface for a simple rest api.

Make sure to review the `build.sbt` file to set the dependencies and configurations needed.

For more details on how to use check the lagom documentation:

[https://www.lagomframework.com/documentation/1.6.x/scala/Home.html](https://www.lagomframework.com/documentation/1.6.x/scala/Home.html)

## 🚀 Quick start

1.  **SBT Setup**

    ```shell
    chmod u+x ./sbt 
    chmod u+x ./sbt-dist/bin/sbt
    ```
2.  **Start sbt and the Lagom development environment**
    ```shell
    ./sbt runAll
    ```

It will take a bit of time for the project to build and run. When finished, the console displays the message `Services started, ....`
