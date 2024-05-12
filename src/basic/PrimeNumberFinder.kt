package basic

fun primeFinder(n:Int):Boolean{

    for (i in 2..n-1){
        if (n%i==0){
            return false
        }
    }

    return true
}


fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    } else if (num <= 3) {
        return true
    } else if (num % 2 == 0 || num % 3 == 0) {
        return false
    }
    var i = 5
    while (i * i <= num) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return false
        }
        i += 6
    }
    return true
}



fun main(){
    println(primeFinder(2))
  println( isPrime(2))
}