# RestCountries Project

This project is a Coding exercise - COUNTRY SERVICE

## Installation

Project is a maven project developed in intelliJ, hence use any version of intelliJ to run it - or import into other IDE - or develop/build/run from commandline with maven.

## Requirements

Java 17

Maven

intelliJ (or other java IDE)

(Remember to enable lombok plugin in IntelliJ)

Since below was not working
``` html 
https://restcountries.eu 
``` 
I have build the war file from
``` html
https://github.com/apilayer/restcountries 
```

and pushed it to my own Tomcat server running - which can be reached from

``` html
http://linode.cevirici.dk:8080/restcountries-2.0.5
```

Be aware that you can change the url of the webservice that is used to something else in the application.properties file
``` properties
webservice.url=http://linode.cevirici.dk:8080/restcountries-2.0.5/
``` 
