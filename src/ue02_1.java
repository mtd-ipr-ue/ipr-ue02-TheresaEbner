import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Geben Sie die erste Zahl ein:");
        int first = In.readInt();
        Out.println("Geben Sie die zweite Zahl ein:");
        int second = In.readInt();
        Out.println("Geben Sie die dritte Zahl ein:");
        int third = In.readInt();

        if (first >= second && first >= third) {
            System.out.println("Die größte Zahl ist: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("Die größte Zahl ist: " + second);
        } else {
            System.out.println("Die größte Zahl ist: " + third);
        }
    }
}

