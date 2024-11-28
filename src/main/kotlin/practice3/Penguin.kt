package practice3
// 상위 클래스 init이 먼저 실행된 후 하위 클래스 실행 주의
class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wing: Int = 2

    override fun move() {
        println("펭귄이 뒤뚱")
    }

    override val leg: Int
        get() = super.leg + this.wing

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3

}