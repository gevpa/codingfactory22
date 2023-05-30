package gr.aueb.cf.ch7;

/**
 * Replaces a string
 */
public class ReplaceApp {

    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashTitle;

        dashTitle = title.replace(" ", "-");
        System.out.println(dashTitle);
    }
}
