public class Q3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez fournir un nombre en argument.");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Argument invalide. Veuillez fournir un nombre entier.");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
