import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Geben sie die Jahreszahl ein:");
        int year = In.readInt();
        Out.println("Geben sie den Monat (als Zahl) ein:");
        int month = In.readInt();
        int days = 0;
        int leap = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                Out.println("Fehler!!!! Falsche Zahl du Idiot! oh oh!!!! oh nein!!! :(");
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            leap = 1; 
        }  

        if (leap == 1 && month == 2) {
            days = 29;
        }

        Out.println("Tage des Monats: " + days);
    }
}
