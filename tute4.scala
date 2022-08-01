package tutorial

import java.util.Scanner


object tute4 {
  var input=new Scanner(System.in);
  def main(args:Array[String]){
    
  }
  
  //question 1
  def interest(){
    println("Question 1 ");
    var deposit:Double=0.0f;
    var flat:Double=0.0f;
    println("Enter the deposite amount : ");
    deposit=input.nextInt();
    if(deposit<=20000)flat=2.0f;
    else if(deposit<=200000)flat=4.0f;
    else if(deposit<=2000000)flat=3.5f;
    else if(deposit>2000000)flat=6.0f;
    println("You will get "+deposit*flat/100+" after end of the year");
  }
  interest();
  
  //question 2
  def patternMaching(){
    var num:Int=0;
    println("\n\nQuestion 2");
    println("Enter your number : ");
    num=input.nextInt();
    if(num<=0) println("Entered number is zero or negative");
    else if(num%2==0) println("Entered number is even");
    else println("Entered number is odd");
  }
  patternMaching();
  
  
  //question 3
  def toUpper(str:String):String =str.toUpperCase();
  def toLower(str:String):String =str.toLowerCase();
  def formatName(name:String)(rangeStart:Int=0,rangeEnd:Int=0)(identifier:Char='0'):String={
    
    var temp:String="";
    if(rangeStart==0 && rangeEnd==0 && (identifier=='U' || identifier=='L')){
      if(identifier=='U') return toUpper(name);
      else if(identifier=='L') return toLower(name);
    }
    else if(rangeStart==0 && rangeEnd==0 && identifier=='0'){
      return name;//as it is
    }
    else{
      var i:Int=0;
      var ch:Char='A';
      for(i<-0 until name.length()){
        ch=name.charAt(i);
        if(i>=rangeStart && i<rangeEnd){
          if(identifier=='U') temp=temp+toUpper(ch.toString());
          else if(identifier=='L') temp=temp+toLower(ch.toString());
        }
        else{
          temp=temp+ch.toString();
        }
      }
      
    }
    return temp; 
  }
  
  println("\n\nQuestion 3");
  println(formatName("Benny")()('U'));
  println(formatName("Niroshan")(1,2)('U'));
  println(formatName("Saman")()('L'));
  println(formatName("Kumara")(5,6)('U'));
  
  
}