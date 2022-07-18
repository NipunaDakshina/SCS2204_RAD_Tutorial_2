package tutorial

object tute3 {
  val PI:Float=3.14f;
  def main(args:Array[String]){
    
  }
  //question 1
  def areaOfDisk(r:Int){
      var area=PI*r*r;
      println("Area of the Disk : "+area);
  }
  
  //question 2
  def temp(t:Int){
    var faran=t*1.8f+32.00f;
    println("Temperature in Fahrenheit : "+faran);
  }
  
  //question 3
  def volumeOfSphere(r:Int){
    var vol=4/3*PI*r*r*r;
    println("Volume of Sphere : "+vol);
  }
  
  //question 4
  def findCost(noOfBooks:Int){
    var disCost:Double=0.0f;
    var shippingCost:Double=0.0f;
    var totalCost:Double=0.0f;
    if(noOfBooks<=50){
      disCost=24.95*noOfBooks-24.95*noOfBooks*40/100;
      shippingCost=3.0f*noOfBooks;
      totalCost=disCost+shippingCost;
      println("Total wholesale cost : "+totalCost);
    }
    else{
      disCost=24.95*noOfBooks-24.95*noOfBooks*40/100
      shippingCost=3.0f*50+(noOfBooks-50)*0.75f;
      totalCost=disCost+shippingCost;
      println("Total wholesale cost : "+totalCost);
    }
  }
  
  //question 5
  def totalRunningTime(easyPace:Int,Tempo:Int){
    var time=easyPace*8+Tempo*7;
    println("Total Running Time : "+time);
  }
  
  
  //question 1
  areaOfDisk(5);
  //question 2
  temp(35);
  //question 3
  volumeOfSphere(5);
  //question 4
  findCost(60);
  //question 5
  totalRunningTime(4,3);
}