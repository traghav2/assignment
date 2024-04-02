import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        double base;  
        double height;  
        double area;
     
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the base of the triangle: ");
        base = in.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = in.nextDouble();
     
        area = 0.5 * base * height;  
     
        System.out.printf("The area of the triangle is: %.2f", area);
      }    
}
