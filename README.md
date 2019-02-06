# springWebApp_BDMDataTables

<h2>Springboot Web Application supporting JQuery DataTables</h2>

This repository contains a springBoot application that conducts a look up on an internal database table and returns a select number of columns. It is intended to be used by the customer service team during our migration from ACI for transaction processing.

<b>Runtime Requirements:</b>

1. You have the Java Development Kit and Java Runtime Environment Install >= Java 8
2. You have Maven installed >= 3.1.0

<b>To Run This Application:</b>

Note: You'll need credentials for JDBC and API keys for Okta

1. Clone the repo and `cd` into the parent directory
2. Run `mvn package` to create a JAR
3. Run `java -jar /target/*.1.0-SNAPSHOT.jar`
