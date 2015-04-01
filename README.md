# interop

This is a simple example of calling Clojure (1.6.0+) code from Java.

The Clojure src file consists of 2 functions
1. Sums the elements of a Java Array
2. Maps a function onto each element of a Java Array

Some of the ideas were borrowed from the Clojure - Java API found at
http://clojure.github.io/clojure/javadoc/clojure/java/api/Clojure.html

## Steps

Create a uberjar of the Clojure code using lein.
Place the standalone JAR file under the javaCode directory for convenience. It could be anywhere on the Java classpath, of course.
To compile the Java code, from the command line:
$ javac -cp interop-0.1.0-SNAPSHOT-standalone.jar Interop.java
and run it
$ java -cp interop-0.1.0-SNAPSHOT-standalone.jar:. Interop
