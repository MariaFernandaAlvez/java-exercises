public class P2RangoCalificaciones {

    public static void main(String[] args) {

        //estructuras condicionales

        int nota = 70;

        if (nota >= 70) {
            System.out.println ("Approved");
        } else {
            System.out.println ("Disapproved");
        }

        // A 80 B 70 C 60 D 0

        int qualification = 50;
        String graduate;

        if (qualification >= 80) {
            graduate = "A";
        } else if (qualification < 80 && qualification >= 70) {
            graduate = "B";
        } else if (qualification < 70 && qualification >= 60) {
            graduate = "C";
        } else if (qualification < 60 && qualification >= 0) {
            graduate = "D";
        } else {
            graduate = "";
        }

        switch (graduate) {
            case "A":
            case "B":
                System.out.println ("Approved");
                break;
            case "C":
            case "D":
                System.out.println ("Disapproved");
                break;
            default:
                System.out.println ("Invalid qualification");
        }

    }
}