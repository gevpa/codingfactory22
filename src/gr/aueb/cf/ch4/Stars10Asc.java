package gr.aueb.cf.ch4;

/**
 * ektyponei se ayksousa seira 10 *
 * se kathe grammh
 */
public class Stars10Asc {


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
