package basic

fun vowelsCount(str: String):Int {

    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0
    for (char in str) {
        if (vowels.contains(char)) {
            count++
        }
    }
    return count
}

fun main(){
    println("Enter a String: ")
    val input = readlnOrNull().toString()
    val vowelCount = vowelsCount(input)
    println("Numbers of vowels in $input is $vowelCount")

}