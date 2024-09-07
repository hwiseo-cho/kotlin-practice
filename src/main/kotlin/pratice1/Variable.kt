package pratice1

fun main(args: Array<String>) {
    /**
     * 1. 가변 / 붋변
     */
    // 가변
    // int num1 = 1;
    var num1 = 1;
    var num3: Int = 1;
    var num5: Int;

    // 불변
    // final int num2 = 1;
    // 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.
    val num2 = 1;
    val num4: Int = 1;
    val num6: Int;

    /**
     * 2. Nullable 변수 선언
     */
    var num7: Int?

    /**
     * 3. 객체 인스턴스화
     */
    var test = Test()

}