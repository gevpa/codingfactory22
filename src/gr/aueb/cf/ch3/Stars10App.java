package gr.aueb.cf.ch3;

/**
 * Εκτυπώνει 10 αστεράκια (10 φορές
 * απο ένα αστεράκι).
 */
public class Stars10App {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println("*"); // αν θέλουμε τα * να εκτυπωθούν οριζόντια
                                     // τότε βγάζουμε το ln απο το print
            i++;
        }
    }
}
