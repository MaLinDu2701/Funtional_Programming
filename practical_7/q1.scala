object q1 extends App{

class Rational(x:Int,y:Int){

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  var number=x/gcd(x,y);
  var denom=y/gcd(x,y);

  def neg(): Unit = {
    number = number * (-1)
  }
  def sub(r: Rational)=new Rational(number*r.denom-r.number*denom,denom*r.denom)

}
val r1=new Rational(3,5)
r1.neg();

  println(r1.number+"/"+r1.denom)



  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  val ans=x.sub(y).sub(z)
  println(ans.number+"/"+ans.denom)

}
