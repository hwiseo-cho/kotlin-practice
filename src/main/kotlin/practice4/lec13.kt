package practice4


class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    // 권장
//    class LivingRoom(
//        private val area: Double
//    )
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse.address
    }
}