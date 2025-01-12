interface Base {
    fun print()
}

class BaseImpl(val X: Int) : Base {
    override fun print() {
        println("X=$X")
    }
}

class Derived(b: Base) : Base by b

fun main(){
    val base  = BaseImpl(10);
    Derived(base).print();
}