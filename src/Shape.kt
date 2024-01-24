abstract class Shape (_name : String) : Dimensionable{
    open var name = _name

    open fun getArea():Double {
        return 0.0;
    }
}