import java.util.Scanner

fun main() {
    //這四行是要把各自的class指定到各個形狀裡
    var square = Square("Square")
    var circle = Circle("Circle")
    var triangle = Triangle("Triangle")
    var equilateralTriangle = EquilateralTriangle("EquilateralTriangle")

    val scanner = Scanner(System.`in`)//這是用戶輸入時用的
    fun inputsquare(){
        println("Enter the length of square:")
        var squareLength = scanner.nextDouble()
        println("Enter the height of square")
        var squareHeight = scanner.nextDouble()
        square.setDimensions(squareLength, squareHeight)//這是把在class square 的setDimensions叫出來
    }
    fun inputcircle(){
        println("radius of circle:")
        var radius = scanner.nextDouble()
        circle.setDimensions(radius)
    }

    fun inputtriangle(){
        println("Enter the side1 of triangle:")
        var side1 = scanner.nextDouble()
        println("Enter the side2 of triangle:")
        var side2 = scanner.nextDouble()
        println("Enter the side3 of triangle:")
        var side3 = scanner.nextDouble()
        triangle.setDimensions(side1,side2,side3)
    }

    fun inputequilateralTriangle(){
        println("Enter the length of Equilateral Triangle:")
        var length = scanner.nextDouble()
        equilateralTriangle.setDimensions(length,length,length)
    }
    inputsquare()
    println("Square Area: ${square.getArea()}")

    inputcircle()
    println("Circle Area:${circle.getArea()}")

    inputtriangle()
    println("Triangle Area:${triangle.getArea()}")

    inputequilateralTriangle()
    println("Equilateral Triangle Area:${equilateralTriangle.getArea()}")
}