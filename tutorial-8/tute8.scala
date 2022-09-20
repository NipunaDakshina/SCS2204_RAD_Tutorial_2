
object MyClass {
    
  case class Point(var x: Int, var y: Int){

  def +(that: Point) : Point = Point(x + that.x, y + that.y)

  def move(dx: Int, dy: Int) : Unit = {
    x = x + dx
    y = y + dy
  }

  def distance(that: Point): Double = scala.math.sqrt(scala.math.pow(that.y - y, 2) + scala.math.pow(that.x - x, 2))

  def swap(): Unit = {
    val temp = x
    x = y
    y = temp
  }
    
      
  }    
    
    def main(args: Array[String]) {
        var p1=Point(2,5);
        var p2=Point(3,4);
        println("Addition of p1 and p2 : "+(p1+p2));
        p1.move(2,3);
        //now p1(2,8)
        println("Point after x coordinate of p1 is moved by 2 and y  coordinate of p1 is moved by 3 :"+p1);
        println("Distance between p1 and p2 : "+p1.distance(p2));
        
        p1.swap();
        //now p1(8,4)
        println("After swapping coordinates of p1 "+p1);
    }
}