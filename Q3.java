public class Q3 {

    public static void main(String[] args) {
        String ligne = "";
        int nbetoile = Integer.parseInt(args[0]);
        for (int i = 0; i < nbetoile; i++) {
            ligne += "*";
        }

        System.out.println(ligne);
    }
}
