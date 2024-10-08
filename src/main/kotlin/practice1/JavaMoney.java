package practice1;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {

    private final long amount;

    public JavaMoney(long amount){
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        System.out.println("여긴 compareTo");
        return Long.compare(this.amount, o.amount);
    }
}
