tutorial
========

Microblogging statsu crawler, applying to Weibo and Twitter platform
Weibo: implemented by crawler4j
Twitter: dummy crawler, implmented by Twitter API

Persistent Layer Instructions
==================
0. Chagne pom file to conform to underlying database.

1. Run the command *mvn clean compile*. This builds everything and enhances the classes.

2. Run the command *mvn datanucleus:schema-create*. This creates the schema for the tutorial.

3. Run the command *mvn exec:java*. This runs the tutorial.

4. Run the command *mvn datanucleus:schema-delete*. This deletes the schema for the tutorial
