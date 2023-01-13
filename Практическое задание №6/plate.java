
import java.util.Scanner;

public class plate {

    private static Scanner in = new Scanner(System.in);

    private int currentFood; // количество еды, которое есть на текущий момент в тарелке

    public plate(int currentFood) {
        this.currentFood = currentFood;
    }

    public int getFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public int decreaseFood(int foodCount) {
        if (currentFood >= foodCount) {
            currentFood -= foodCount;
        }
        return currentFood;
    }

    public void printInfo() {
        System.out.println("В тарелке осталось " + currentFood + " грамм еды");
    }
}
