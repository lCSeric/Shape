import kotlin.math.sqrt

open class Triangle(_name : String): Shape(_name) {

    private var side1 :Double= 0.0
    private var side2 :Double= 0.0
    private var side3 :Double= 0.0

    override fun printDimensions(){
        println("side1:${side1}, side2:${side2} ,side3:${side3}")
    }
    open fun setDimensions(_side1:Double, _side2:Double, _side3: Double){
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }

    override fun getArea():Double{
        var perimeter = side1 + side2 + side3
        var s = perimeter /2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
}