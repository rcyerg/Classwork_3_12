package circle_area_calculation;

public class CircleArea {
    public static void main(String[] args) {
        int radius = 8;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println(area);
        int areaRounded = (int) Math.round(area);
        System.out.println("The area when rounded to a whole number is equal to " + areaRounded + ".");
    }
}
