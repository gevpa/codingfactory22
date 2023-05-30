package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Enas mikros batraxos thelei na perasei ena potami
 * O frog brisketai sth thesi X kai thelei na ftasei sth
 * thesh Y ( h se thesh > Y). O frog jumps a fixed distance, D.
 *
 * Briskei ton elaxisto ariumo jumps pou o small frog prepei
 * na kanei oste na ftasei (h na kseperasei) ton stoxo.
 *
 * Gia paradeigma, an exoume:
 * X = 10
 * Y = 85
 * D = 30
 *
 * tote o small frog tha xreiastei 3 jumps, giati:
 * Starts at 10, kai meta to 1o jump paei sth thesi 10 + 30 = 40
 * Sto 2o jump paei 40 + 30 = 70
 * Kai sto 3o jump paei 70 + 30 = 100
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int d = 0;
        int jumps = 0;

        System.out.println("Please provide x, y, d");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();

        for (int i = x; i < y; i = i + d) {
            jumps++;
        }

        System.out.println("Jumps: " + jumps);
    }
}
