public class BmiService {

    public int calculate (double a_m, double b_kg) {
        double index = a_m / (b_kg * b_kg);
        return (int) index;
    }
}