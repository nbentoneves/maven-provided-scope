# Maven Scopes

> provide - This is much like compile, but indicates you expect the JDK or a container to provide the dependency at runtime. For example, when building a web application for the Java Enterprise Edition, you would set the dependency on the Servlet API and related Java EE APIs to scope provided because the web container provides those classes. This scope is only available on the compilation and test classpath, and is not transitive.

----
This project shows how can you work with maven provided dependencies. You can change the scope of guava at utils module and see what happens at the service module.

* utils - module with guava collection declared with provided scope
* service - module with spring boot service, this allows you to see what happens when the scope is provided or compile.

# Results

| Utils - Guava Scope                           | Service - Guava Dependency | Result                                             | Dependency Tree                               |
|:-------------------------------------------------:|:------------:|:--------------:|:-----------------:|
| provided - 29.0-jr                              | yes - 22.0                 | :white_check_mark:                                 | Transitive guava - No                         |
| compile - 29.0-jr   | no                         | :white_check_mark:                                 | Transitive guava - Yes                        |
| compile - 29.0-jr   | yes - 22.0                 | :white_check_mark:                                 | Transitive guava - Yes (but use 22.0 version) |
| compile - 29.0-jr   | no                         | :no_entry_sign: java.lang.ClassNotFoundException | Transitive guava - No                         |

# Help

* http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html
