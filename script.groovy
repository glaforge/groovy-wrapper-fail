def input="lol1,lol2,lol3"

class CSVParser {
    static def parseCSV(file, closure) {
        def lineCount = 0
        file.eachLine() { line ->
            def field = line.tokenize(",")
            lineCount++
            closure(lineCount,field)
        }
    }
}

use(CSVParser) {
    input.parseCSV { index, field ->
        variable1 = "${field[0]}"
        variable2 = "${field[1]}"
        variable3 = "${field[2]}"
        println variable1
        println variable2
        println variable3                        
    }
}

