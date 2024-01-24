import java.awt.geom.Area

class Square(_name : String): Shape(_name) {
    override var name = _name
    private var length: Double = 0.0
    private var height: Double = 0.0

    override fun printDimensions(){
        println("length:${length}, height:${height}")
    }

    fun setDimensions(_length: Double, _width: Double){
        length = _length
        height = _width
    }

    override fun getArea():Double{
        return length*height
    }
}