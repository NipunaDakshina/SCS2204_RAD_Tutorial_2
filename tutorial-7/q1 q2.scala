

object MyClass {
    class Rational(x:Int,y:Int){
        def numer =x //gcd(x,y);
        def denom =y//gcd(x,y);
        //require(y>0,"Must be greater than 0");
        //private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
        
        def add(r:Rational)=new Rational (numer*r.denom+r.numer*denom,denom*r.denom);
        def mul(r:Rational)=new Rational(numer*r.numer,denom*r.denom);
        def div(r:Rational)=new Rational(numer*r.denom,denom*r.numer);
        def neg=new Rational(-this.numer,this.denom);
        def sub(r:Rational)=this.add(r.neg);
        override def toString =numer+" / "+denom;
        
    }
    def main(args:Array[String]){
        var x=new Rational(2,3);
        var y=new Rational(2,5);
        var z=new Rational(1,5);
        println(x);
        println(y);
        println(z);
        println(x.add(y));
        println(x.mul(y));
        println(x.div(y));
        println(x.neg);
        println(x.sub(y));
        println(x.sub(y).sub(z));
        
    }
    
    
    
    
    
    
}