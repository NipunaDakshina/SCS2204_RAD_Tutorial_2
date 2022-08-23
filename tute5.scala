package tutorial

object tute5 {
 // var input=new Scanner(System.in);
  def main(args:Array[String]){
    
  }
  //question 1
  def prime(n:Int,i:Int=2):Boolean={
    if(n==i) return true;
    else if(n%i==0) return false;
    else return prime(n, i+1);
  }
  
  //question 2
  def findPrime(n:Int):Int={
    if(n==1) return 1;
    else if(prime(n)==true) print(n+" ");
    findPrime(n-1);
  }
  
  //question 3
  var sum:Int=0
  def addNumber(n:Int):Int={
    if(n==0) return sum ;
    else sum=sum+n;
    addNumber(n-1);
  }
  
  
  //question 4
  def oddEven(n:Int):String={
    if(n==1) return "Odd";
    else if(n==0) return "Even";
    oddEven(n-1);
  }
  
  //question 5
  var sumEven:Int=0
  def addEven(n:Int):Int={
    if(n==1) return sumEven;
    else if(oddEven(n)=="Even"){
      sumEven=sumEven+n;
    }
    addEven(n-1);
  }
//question 6
  def fib(n:Int):Int={
    if((n==0)||(n==1)){
      return n;
    }
    else (fib(n-1)+fib(n-2));
  }
  def printFiboSeries(n:Int,i:Int=0){
    var i:Int=0;
    while(i<n){
      print(fib(i)+" ");
      i=i+1;
    }
  }

println("Question 1");
println(prime(10));

println("Question 2");
findPrime(10);
println(" ");

println("Question 3");
println(addNumber(5));

println("Question 4");
println(oddEven(7));

println("Question 5");
println(addEven(10));

println("Question 6");
printFiboSeries(15);







}
