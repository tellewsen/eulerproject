# eulerproject
Solutions to problems from projecteuler.net


Compile and run solutions with 
```sh
kotlinc <filename>.kt -include-runtime -d <filename>.jar
java -jar <filename>.jar
```

If you're looking for dependency information you are out of luck.
I've just installed the latest kotlin and java 21 and used their builtin libraries.

Running `kotlinc -J-version` spits out the following:
```
openjdk version "21.0.7" 2025-04-15
OpenJDK Runtime Environment (build 21.0.7+6-Ubuntu-0ubuntu124.04)
OpenJDK 64-Bit Server VM (build 21.0.7+6-Ubuntu-0ubuntu124.04, mixed mode, sharing)
```
Hopefully that's enough for you to get it working.
