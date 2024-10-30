import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {

        double radius = 4.0;
        double centerX = 0.0;
        double centerY = 0.0;
        boolean insideRectangle;

        Out.println("Geben Sie die x-Koordinate ein.");
        double x = In.readDouble();
        Out.println("Geben Sie die y-Koordinate ein.");
        double y = In.readDouble();

        double distanceFromCenter =  Math.sqrt((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY));
       insideRectangle = x >= -4 && x <= 4 && y >= -4 && y <= 4;


        if (insideRectangle && distanceFromCenter >= radius) {
            System.out.println("Der Punkt liegt in der grünen Fläche.");
        } else {
            System.out.println("Der Punkt liegt außerhalb der grünen Fläche.");
        }
 
    }
}
