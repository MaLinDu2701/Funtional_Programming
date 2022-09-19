import scala.math._

object point extends App{

  case class Point(a: Double, b: Double) {
    def x: Double = a;

    def y: Double = b;

    ////+ Operator
    def +(point: Point) = Point(this.x + point.x, this.y + point.y);

    //move the point
    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy);

    //Distance between 2 given points
    def distance(p1: Point): Double = {
      val y2: Double = pow(p1.y - this.y, 2);
      val x2: Double = pow(p1.x - this.x, 2);
      return sqrt(y2 + x2);
    }

    //switch x and y
    def invert() = Point(this.y, this.x);

  }

  val p1=Point(1,1);
  val p2=Point(2,3)

  println("p1 + p2 =" +(p1+p2))

  println("Distance between " + p1 + " and " + p2 + " = " + p1.distance(p2))

  println("Invert of " + p2 + " = " + p2.invert)

}
