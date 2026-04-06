package week1_kaka;

public class Practice2 {

	public static double calcTriangleArea(double base, double height) {
        return base * height / 2;
    }
	public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
	public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        double circleArea = calcCircleArea(5.0);

        System.out.println(triangleArea);
        System.out.println(circleArea);
	}


}
