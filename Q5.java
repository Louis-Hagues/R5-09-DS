public class Q5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez fournir un nombre en argument.");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);  // Convertit l'argument en entier
        } catch (NumberFormatException e) {
            System.out.println("Argument invalide. Veuillez fournir un nombre entier.");
            return;
        }

        // Affiche un triangle inversé d'étoiles
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();  // Nouvelle ligne après chaque ligne d'étoiles
        }

    }
}
