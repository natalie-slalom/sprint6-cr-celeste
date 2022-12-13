#!/bin/sh
cd usr/share/tomcat/webapps
java -jar api-0.0.1-SNAPSHOT.war > /dev/null 2> /dev/null < /dev/null &
