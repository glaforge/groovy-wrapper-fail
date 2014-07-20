This repo demonstrates failing script prepared with *GroovyWrapper*.

To reproduce:

1) Clone the repo

2) Run: `groovy script.groovy` - everything works fine

3) Run: `groovy GroovyWrapper -m script -c` and then `java -jar script.jar`

4) `java.lang.ClassNotFoundException: CSVParser` occurs
