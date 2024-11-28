package practice3

abstract class Animal(
    protected val species: String,
    protected open val leg: Int,
) {

    abstract fun move()
}