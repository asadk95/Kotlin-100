package others


fun isPalindrome(str: String) {
    if (str == str.reversed()) {
        println("WOW!! It is a palindrome!")
    } else {
        println("Sorry! It is not a palindrome!")
    }


}

fun main() {
    isPalindrome("Hello")
/*    println("Enter a String to check if it is palindrome or not")
    val str = readln().toString()
    if (str == str.reversed()) {
        println("WOW!! It is a palindrome!")
    } else {
        println("Sorry! It is not a palindrome!")
    }*/
}