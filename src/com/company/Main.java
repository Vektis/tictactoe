package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        mode 1 = PvP
        mode 2 = PvCPU(never lose, only tie or win)
         */
        boolean [] tc = {true,true,true,true,true,true};
        int qwert = 0;
        String x = "x";
        String o = "o";
        String n = " ";
        String table[][] = {{n, n, n}, {n, n, n}, {n, n, n}};
        for (int i = 0; i < 3; i++) {
            System.out.println(table[i][0] + " | " + table[i][1] + " | " + table[i][2]);
            //System.out.println("  |   |");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("1 for PvP, 2 for PvE.");
        // (1)PVP BELOW
        if (input.nextInt() == 1) {
            while (true) {
                int p1x, p1y, p2x, p2y;

                System.out.println("Player 1 turn(X): ");
                System.out.println("Which horizontal position?(across-1,2,3): ");
                p1x = input.nextInt() - 1;
                System.out.println("Which row?(1,2,3): ");
                p1y = input.nextInt() - 1;
                while (table[p1y][p1x].equals(o) || table[p1y][p1x].equals(x)) {
                    System.out.println("Spot already taken. Try again.");
                    System.out.println("Which horizontal position?(across-1,2,3): ");
                    p1x = input.nextInt() - 1;
                    System.out.println("Which row?(1,2,3): ");
                    p1y = input.nextInt() - 1;
                }
                table[p1y][p1x] = x;
                for (int i = 0; i < 3; i++) {
                    System.out.println(table[i][0] + " | " + table[i][1] + " | " + table[i][2]);
                    //System.out.println("  |   |");
                }

                for (int i = 0; i < 3; i++) {
                    //System.out.println(table[i][0].equals(x) && table[i][1].equals(x) && table[i][2].equals(x));
                    if (table[i][0].equals(x) && table[i][1].equals(x) && table[i][2].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    } else if (table[0][i].equals(x) && table[1][i].equals(x) && table[2][i].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    } else if (table[0][0].equals(x) && table[1][1].equals(x) && table[2][2].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    } else if (table[0][2].equals(x) && table[1][1].equals(x) && table[2][0].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    }
                    //System.out.println("  |   |");
                }

                System.out.println("Player 2 turn(O): ");
                System.out.println("Which horizontal position?(across-1,2,3): ");
                p2x = input.nextInt() - 1;
                System.out.println("Which row?(1,2,3): ");
                p2y = input.nextInt() - 1;
                while (table[p2y][p2x].equals(o) || table[p2y][p2x].equals(x)) {
                    System.out.println("Spot already taken. Try again.");
                    System.out.println("Which horizontal position?(across-1,2,3): ");
                    p2x = input.nextInt() - 1;
                    System.out.println("Which row?(1,2,3): ");
                    p2y = input.nextInt() - 1;
                }
                table[p2y][p2x] = o;
                for (int i = 0; i < 3; i++) {
                    System.out.println(table[i][0] + " | " + table[i][1] + " | " + table[i][2]);
                    //System.out.println("  |   |");
                }
                for (int i = 0; i < 3; i++) {
                    //System.out.println(table[i][0].equals(x) && table[i][1].equals(x) && table[i][2].equals(x));
                    if (table[i][0].equals(o) && table[i][1].equals(o) && table[i][2].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    } else if (table[0][i].equals(o) && table[1][i].equals(o) && table[2][i].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    } else if (table[0][0].equals(o) && table[1][1].equals(o) && table[2][2].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    } else if (table[0][2].equals(o) && table[1][1].equals(o) && table[2][0].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    }
                    //System.out.println("  |   |");
                }

            }
        }
        // PVP END


        /*
        PVE(CPU) START
        CPU goes 2nd
         */

        else {
            System.out.println("Player 1 = You, Player 2 = Computer(Expert)");
            while (true) {

                int p1x, p1y, p2x, p2y;
                System.out.println("Player 1 turn(X): ");
                System.out.println("Which horizontal position?(across-1,2,3): ");
                p1x = input.nextInt() - 1;
                System.out.println("Which row?(1,2,3): ");
                p1y = input.nextInt() - 1;
                while (table[p1y][p1x].equals(o) || table[p1y][p1x].equals(x)) {
                    System.out.println("Spot already taken. Try again.");
                    System.out.println("Which horizontal position?(across-1,2,3): ");
                    p1x = input.nextInt() - 1;
                    System.out.println("Which row?(1,2,3): ");
                    p1y = input.nextInt() - 1;
                }
                table[p1y][p1x] = x;
                for (int i = 0; i < 3; i++) {
                    System.out.println(table[i][0] + " | " + table[i][1] + " | " + table[i][2]);
                    //System.out.println("  |   |");
                }


                for (int i = 0; i < 3; i++) {
                    //System.out.println(table[i][0].equals(x) && table[i][1].equals(x) && table[i][2].equals(x));
                    if (table[i][0].equals(x) && table[i][1].equals(x) && table[i][2].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    } else if (table[0][i].equals(x) && table[1][i].equals(x) && table[2][i].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    } else if (table[0][0].equals(x) && table[1][1].equals(x) && table[2][2].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    } else if (table[0][2].equals(x) && table[1][1].equals(x) && table[2][0].equals(x)) {
                        System.out.println("Player 1 wins!");
                        return;
                    }
                    //System.out.println("  |   |");
                }

                /*
                CPU START
                 */
                System.out.println("Player 2's turn!");
                // initial move(center or corner)
                if(!table[1][1].equals(x) && qwert == 0){
                    table[1][1]=o;
                }
                else if(qwert == 0 && table[1][1].equals(x)){
                    table[0][0]=o;  //lmao
                }
                //block enemy moves
                lmao.nextMove(table,qwert);
                //zxc = 0;
                //xc = 0;




                //finish line(links 3)

                /*
                CPU END (below = check)
                 */
                for (int i = 0; i < 3; i++) {
                    System.out.println(table[i][0] + " | " + table[i][1] + " | " + table[i][2]);
                  //  //System.out.println("  |   |");
                }
                for (int i = 0; i < 3; i++) {
                    //System.out.println(table[i][0].equals(x) && table[i][1].equals(x) && table[i][2].equals(x));
                    if (table[i][0].equals(o) && table[i][1].equals(o) && table[i][2].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    } else if (table[0][i].equals(o) && table[1][i].equals(o) && table[2][i].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    } else if (table[0][0].equals(o) && table[1][1].equals(o) && table[2][2].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    } else if (table[0][2].equals(o) && table[1][1].equals(o) && table[2][0].equals(o)) {
                        System.out.println("Player 2 wins!");
                        return;
                    }
                    qwert++;
                    //System.out.println("  |   |");
                }
                int nn = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(table[i][j].equals(o) || table[i][j].equals(x)){
                            nn++;
                        }
                    }
                }
                if(nn == 0){
                    System.out.println("Tie game");
                    return;
                }

            }

        }
    }



}
