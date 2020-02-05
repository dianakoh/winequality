# Wine Quality Data Visualization

A spring web project for visualizing wine quality data

### Resources

* [Highcharts](https://www.highcharts.com/)

### Prerequisites

Sample Data

```
Given wine quality data (.csv file)
Store the given data in DB
	Schema: wine_quality
	Table: product_quality
	Fields:
		INT product_seq
		FLOAT fuxed_acidity
		FLOAT volatile_acidity
		FLOAT citric_acid
		FLOAT residual_sugar
		FLOAT chlorides
		INT free_sulfur_dioxide
		INT total_sulfur_dioxide
		FLOAT density
		FLOAT ph
		FLOAT sulphates
		FLOAT alcohol
		INT quality
```

### Setting Environment
```
JDK 1.8u231
Eclipse
    - STS Plugin(Spring Tools 3 Add-On for Spring Tools 4)
Apache Tomcat 9
    - Add the Tomcat server to the project
MariaDB 10.4.10
JQuery Library
	- jquery-3.4.1.min.js
```

```
pom.xml properties
	- check java-version
	- check springframework-version
pom.xml plugin
	- check maven-compiler-plugin version
	- match source and target to java-version
pom.xml dependedency
	- mariadb-java-client
	- commons-dbcp
	- spring-jdbc
	- mybatis
	- mybatis-spring
	- log4jdbc-log4j2-jdbc4.1
	- jackson
```

### Implementation
```
resources files
	- edit root-context.xml
	- mybatis-config.xml
	- logback.xml
	- log4jdbc.log4j2.properties
	- mapper xml
	
java files
	- DAO
	- Service
	- Controller & RestController
	- VO

jsp, css, js files
	- home.jsp
	- home.css
	- home.js
	- add jquery-3.4.1.min.js
	- add CDN for highcharts in common_resources.jsp
```

### Example

![result](https://github.com/dianakoh/winequality/blob/master/result.png)
