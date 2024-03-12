package area_of_triangle;


public class Triangle {
    double length;
    double height;

    public void triangleAreaCalculation(){
        double triangleArea = (height * length) / 2;
        System.out.println(triangleArea + " Is the area of your triangle.");

    }

    public Triangle(double triangleLength, double triangleHeight){
        height = triangleHeight;
        length = triangleLength;

    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(8.0d, 7.0d);
        triangle1.triangleAreaCalculation();
    }
}
