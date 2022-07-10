//Question 1,2
var k,i,j=2
var m,n=5
var f=12.0f
var g=4.0f
var c='X'

//Question 3 fist part

k+12*m

m/j

n%j

m/j*j

f+10*5+g

i=i+1;
i*n


//Question 3 second part
var A=2
var B=3
var C=4
var D=5
var K=4.3f

B=B-1
println(B*A+C*D)
D=D-1

println(A)
A=A+1

println(-2*(g-K)+C)

println(C)
C=C+1

C=C+1
println(C*A)
A=A+1


//Question 4 part a
val salaryForWorkingHour = 250.00f
val salaryForOTHour = 85.00f
val typicalWorkingHoursPerWeek = 40
val typicalOTHoursPerWeek = 30
val taxRate = 0.12f 

def IsValid(workingHours: Int, otHours: Int): Boolean = workingHours >= typicalWorkingHoursPerWeek && otHours >= typicalOTHoursPerWeek

def TotalSalary(workingHours: Int, otHours: Int): Float = (workingHours * salaryForWorkingHour) + (otHours * salaryForOTHour)

def Tax(totalSalary: Float): Float = totalSalary * taxRate

def TakeHomeSalary(totalSalary: Float, tax: Float) : Float = totalSalary - tax 

def CalculateSalary(workingHours: Int, otHours: Int) : Float = if (IsValid(workingHours, otHours)) { 
  val totalSalary = TotalSalary(workingHours, otHours) 
  val tax = Tax(totalSalary) 
  TakeHomeSalary(totalSalary, tax)
} 

else { 
  println("Working Hours should be greater than or equal to 40 and OT Hours should be greater than or equal to 30  \n")
  0
  
      
}

CalculateSalary(20, 20)



//Question 4 part b
val costForEachPerformance = 500.0f
val costForEachAttendee = 3.00f
val basePrice = 15.00f
val priceChange = 5 

def max(a: Float, b: Float): Float = if (a >= b) a else b

def NumberOfPeople(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120

def TicketPrice(priceChange: Int): Float = basePrice + priceChange

def Income(numberOfPeople: Int, ticketPrice: Float): Float = ticketPrice * numberOfPeople

def Cost(numberOfPeople: Int): Float = costForEachPerformance + (costForEachAttendee * numberOfPeople)

def Profit(income: Float, cost: Float): Float = income - cost

def CalculateProfit(numberOfPeople: Int, ticketPrice: Float) : Float = Profit(Income(numberOfPeople, ticketPrice), Cost(numberOfPeople)) 

def FindBestPrice(priceIncrese: Int, priceDecrese: Int): Float = { 
  
  val numberOfPeople_increased = NumberOfPeople(priceIncrese) 
  val ticketPrice_increased = TicketPrice(priceIncrese) 
  val profit_increased = CalculateProfit(numberOfPeople_increased, ticketPrice_increased)
  val numberOfPeople_decreased = NumberOfPeople(priceDecrese) 
  val ticketPrice_decreased = TicketPrice(priceDecrese) 
  val profit_decreased = CalculateProfit(numberOfPeople_decreased, ticketPrice_decreased)
  
  if(profit_increased >= profit_decreased) ticketPrice_increased else ticketPrice_decreased
} 

FindBestPrice(5, -5)

