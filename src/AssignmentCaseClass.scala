import math.{sqrt,pow}
object AssignmentCaseClass extends App {

    val p1= new Point(10,5)
    val p2=new Point(4,1)
    val p3=p1.move(1,3)
    val p4= new Point(5,8)
    val d= p1.distance(p2)

    println(f"Distance = ${d}%.2f")
    println(p1)
    println(p2)
    println(s"Addition = ${p1+p2}")
    println(s"Invert = ${p4.invert()}")
  }
  // Point CLass
  case class Point(a:Int,b:Int){
      def x:Int=a
      def y:Int=b

    //Q1- Adding two points
    def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)
    
    //Q2 - Move a point by a given distance
    def +(that:Point)= Point(this.x+that.x, this.y+that.y)

    //Q3 - Returning the distance between two given points
    def distance(other:Point):Double = sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2))


    //Q4- Switching the x and y coordinates
    def invert()= Point(this.y,this.x)

}
