public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weght_kg = 98;
        double height_m = 1.87;

        int index = service.calculate(weght_kg, height_m);

        System.out.println("Индекс массы тела: " + index);
    }
}