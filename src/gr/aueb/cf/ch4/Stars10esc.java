package gr.aueb.cf.ch4;

/**
 * ektyponei 10, 9 , 8 ...
 * asteria se kathe grammh
 * ksekinontas apo thn 1h grammh
 */
public class Stars10esc {


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

