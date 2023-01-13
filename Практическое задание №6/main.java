import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        oopDemo();
    }

    private static void oopDemo() {
        // Создать кота. При создании должны указать аппетит (и энергию).
        // По-умолчанию кот голодный.
        // Покормить его.
        // Проверить, сытый ли он.

        Set<cat> set = new HashSet<>();

        plate plate = new plate(250);

        cat gav = new cat("Gav", 200);
        System.out.println(gav.isSatiety()); // false
        gav.eat(plate);
        System.out.println(gav.isSatiety()); // true

        cat murzik = new cat("Murzik", 70);
        System.out.println(murzik.isSatiety()); // false
        murzik.eat(plate);
        System.out.println(murzik.isSatiety()); // false

    }
}