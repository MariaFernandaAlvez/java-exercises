
import java.time.LocalDate;
import java.util.Locale;
import java.time.format.TextStyle;
import java.time.LocalDateTime;

// ISO 8601 = Padron mundial que define como representar una fecha para el mundo entero

public class P3SaludoDiaHryMayMinus {

    public static void main(String[] args) {

        String name = "Fernanda";

        LocalDate today = LocalDate.now();
        Locale uruguay = new Locale ("es","UY");
        String weekday = today.getDayOfWeek().getDisplayName (TextStyle.FULL, uruguay);
        String greeting;
        LocalDateTime now = LocalDateTime.now ();
        if (now.getHour() >= 0 && now.getHour () < 12) {
            greeting = "Good Morning";
        } else if (now.getHour () >= 12 && now.getHour () < 18) {
            greeting = "Good Afternoon";
        } else if (now.getHour () >= 18 && now.getHour () < 24) {
            greeting = "Good Night";
        } else {
            greeting = "Hello";
        }

        System.out.printf ("Hello, %s. Today is %s, %s!.%n", name, weekday, greeting.toUpperCase());

        // %n = Enter
        // System.out.println (name.toUpperCase ()); = mayusculas
        // System.out.println (name.toLowerCase ()); = minusculas
        // System.out.println (name.length ()); = largo de texto
        // String otherName = "fernanda";
        // System.out.println (name.equals (otherName)); = compara dos textos identicos c/ mayus y minus iguales
        // System.out.println (name.equalsIgnoreCase (otherName)); = compara dos textos identicos ignorando mayus y minus


    }


}
