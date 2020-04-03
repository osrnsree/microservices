###Steps to enable unit testing using Groovy and Spock

1) Download the Groovy bin from the below site

https://groovy.apache.org/download.html


2) Extract and copy it to ur local machine...

say e.g. D:\softwares\groovy-3.0.2\lib


3) Intellij > File > Project Strucuture > click on Global Libraries (Platform SEttings)

1) click on + icon..
2) Select Groovy SDK library files pointing to lib folder...
3) Select the module you want to apply Groovy files


4) Enable the groovy spock depedency in build.gradle
    // https://mvnrepository.com/artifact/org.spockframework/spock-core
    testCompile ('org.spockframework:spock-core:1.3-groovy-2.5')

5) Example on youtube
Testing Java, Groovy, Spring and Web Applications with Spock
https://www.youtube.com/watch?v=GYszXrJtxKA