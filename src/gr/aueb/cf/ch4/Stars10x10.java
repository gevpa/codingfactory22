package gr.aueb.cf.ch4;

/**
 * ektyponei 10 grammew me 10 asterakia
 * se kathe grammh
 */
public class Stars10x10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}