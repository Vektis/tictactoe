package com.company;

/**
 * Created by vr834 on 12/22/16.
 */
public class lmao {
    //lmao
    public String[][] s;
    public String x = "x";
    public String o = "o";

    public lmao(String[][] t) {
        s = t;
    }

    public static String[][] nextMove(String[][] table, int q) {
        String x = "x";
        String o = "o";
        String n = " ";
       // win rounds if 2 o's OR if 2 x's prevent loss
        int xc = 0;
        int oc = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //horiz
                if(table[i][0].equals(o) && table[i][1].equals(o) || table[i][0].equals(x) && table[i][1].equals(x)){
                    if(!table[i][2].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[i][2] = o;

                    System.out.println("w");
                    return table;
                }
               if(table[i][2].equals(o) && table[i][1].equals(o) || table[i][2].equals(x) && table[i][1].equals(x)){
                   if(!table[i][0].equals(n)){
                       System.out.println("lmao");
                       break;
                   }
                    table[i][0] = o;

                   System.out.println("a");
                    return table;
                }
                if(table[i][0].equals(o) && table[i][2].equals(o)||table[i][0].equals(x) && table[i][2].equals(x)){
                    if(!table[i][1].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[i][1] = o;
                    System.out.println("s");
                    return table;
                }
                //vertical
                if(table[0][i].equals(o) && table[1][i].equals(o) || table[0][i].equals(x) && table[1][i].equals(x)){
                    if(!table[2][i].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[2][i] = o;

                    System.out.println("w");
                    return table;
                }
                if(table[2][i].equals(o) && table[1][i].equals(o) || table[2][i].equals(x) && table[1][i].equals(x)){
                    if(!table[0][i].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[0][i] = o;

                    System.out.println("a");
                    return table;
                }
                if(table[0][i].equals(o) && table[2][i].equals(o)||table[0][i].equals(x) && table[2][i].equals(x)){
                    if(!table[1][i].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[1][i] = o;
                    System.out.println("s");
                    return table;
                }
                //diagonal
                //neg slope
                if(table[2][2].equals(o) && table[1][1].equals(o)||table[1][1].equals(x) && table[2][2].equals(x)){
                    if(!table[0][0].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[0][0] = o;
                    System.out.println("s");
                    return table;
                }
                if(table[2][2].equals(o) && table[0][0].equals(o)||table[0][0].equals(x) && table[2][2].equals(x)){
                    if(!table[1][1].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[1][1] = o;
                    System.out.println("s");
                    return table;
                }
                if(table[0][0].equals(o) && table[1][1].equals(o)||table[1][1].equals(x) && table[0][0].equals(x)){
                    if(!table[2][2].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[2][2] = o;
                    System.out.println("s");
                    return table;
                }
                //pos slope
                if(table[0][2].equals(o) && table[1][1].equals(o)||table[1][1].equals(x) && table[0][2].equals(x)){
                    if(!table[2][0].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[2][0] = o;
                    System.out.println("s");
                    return table;
                }
                if(table[0][2].equals(o) && table[2][0].equals(o)||table[2][0].equals(x) && table[0][2].equals(x)){
                    if(!table[1][1].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[1][1] = o;
                    System.out.println("s");
                    return table;
                }
                if(table[2][0].equals(o) && table[1][1].equals(o)||table[1][1].equals(x) && table[2][0].equals(x)){
                    if(!table[0][2].equals(n)){
                        System.out.println("lmao");
                        break;
                    }
                    table[0][2] = o;
                    System.out.println("s");
                    return table;
                }
                //end of coord mov
            }
        }


        // random locations, no possible wins/losses at current turn

        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                //System.out.println(table[0][0].equals(n));
                if (table[k][j].equals(n) && q != 0) {
                    table[k][j] = o;
                    return table;
                }
            }
        }

        return table;
    }
}
       /* String x = "x";
        String o = "o";
        String n = " ";
        int xc = 0;
        int zxc = 0;
        int count = 0;
        int count1 = 0;
        boolean [] tc = {true,true,true,true,true,true};
        boolean c = true;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(table[j][i].equals(x)){
                    zxc++;
                    if(zxc==2){
                        //c = false;
                        System.out.println("wew lad");
                        if(table[2][i].equals(x) && table[1][i].equals(x) ){
                            table[0][i] = o;
                            System.out.println("vert1");
                            tc[0] = false;
                            count++;
                            return table;

                        }
                        else if(table[0][i].equals(x) && table[1][i].equals(x)){
                            table[2][i] = o;
                            System.out.println("vert 3");
                            tc[1] = false;
                            count++;
                            return table;
                        }
                        else if(table[0][i].equals(x) && table[2][i].equals(x)){
                            table[1][i] = o;
                            System.out.println("vert mid");
                            tc[2] =false;
                            count++;
                            return table;
                        }
                    }
                    //break;
                }


                if(table[i][j].equals(x) && c){
                    xc++;
                    if(xc==2){
                        System.out.println("ayy lmao");
                        if(table[i][2].equals(x) && table[i][1].equals(x)){
                            System.out.println("horz 1");
                            table[i][0] = o;
                            tc[3] = false;
                            return table;
                        }
                        else if(table[i][0].equals(x) && table[i][1].equals(x)){
                            table[i][2] = o;
                            System.out.println("horz 3");
                            tc[4] = false;
                            return table;
                        }
                        else if(table[i][0].equals(x) && table[i][2].equals(x)){
                            table[i][1] = o;
                            System.out.println("horz mid");
                            tc[5] = false;
                            return table;
                        }
                        //break;
                    }


                }
                int oc = 0;
                int xxc = 0;
                for (int k = 0; k < table.length; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (table[l][k].equals(o)){
                            oc++;
                        }
                        if (table[l][k].equals(x)){
                            xxc++;
                        }
                    }
                }
                System.out.println(xxc != oc && q != 0 );
                if(q != 0 && xxc != oc){
                    System.out.println("kms");
                    for (int k = 0; k < table.length; k++) {
                        for (int l = 0; l < 3; l++) {
                            if(table[k][l].equals(n)) {
                                table[k][l] = o;
                                return table;
                            }
                        }
                    }
                }


                //break;

            }



        }
        return table;}
    */



