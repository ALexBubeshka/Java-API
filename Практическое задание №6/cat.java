import java.text.DecimalFormat;


public class cat extends Object {

    private String name;
    private final int appetite; // аппетит кота в условных единицах
    private int satiety; // сытность - либо сыт либо голоден
    private double value;
    int energy; // энергия кота от 0 до 10

    public cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(plate plate) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if (plate.getFood() > appetite) {
            satiety = plate.decreaseFood(appetite);
            value = 100.00;
            String result = decimalFormat.format(value);
            energy = (int) Math.round(value/10);
            System.out.println("Кот наелся на " + result + "%");
            System.out.println("Энергия кота равна " + energy + " баллам");
            plate.printInfo();
        } else {
            value = (double) plate.getFood() / (double) appetite * 100;
            String result = decimalFormat.format(value);
            energy = (int) Math.round(value/10);
            System.out.println("Кот наелся на " + result + "%");
            System.out.println("Энергия кота равна " + energy + " баллам");
            plate.setCurrentFood(0);
            plate.printInfo();

        }
    }

    public boolean isSatiety() {
        return value == 100;
    }

}
