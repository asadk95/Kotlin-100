package basic
// alternating sum using vararg

fun main(){
    val sum = alternatingSum(1,2,3,4,5,6,8,7)
    println(sum)
    val sum1 = alternatingSum2(1,2,3,4,5,6,8,7)
    println(sum1)
}
fun alternatingSum(vararg numbers:Int):Int{
var result =0
for ((index,value) in numbers.withIndex()){
    if (index%2==0){
        result+=value
    }
    else{
        result-=value
    }
}

return result
}

fun alternatingSum2(vararg numbers:Int):Int{

    var sum=0
    var toggle =true
    for (number in numbers){


        if (toggle){
            sum +=number
        }else
        {
            sum -=number
        }
        toggle =!toggle
    }
    return sum
}