class Circle(_name : String): Shape(_name) {

    override var name= _name
    private var radius: Double = 0.0

    fun setDimensions(_radius: Double){
        radius = _radius
    }

    override fun printDimensions(){
        println("radius:${radius}")
    }
    override fun getArea(): Double {
        return radius*radius* Math.PI

    }
}