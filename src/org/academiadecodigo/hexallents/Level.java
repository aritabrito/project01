package org.academiadecodigo.hexallents;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Level {

    private int[][] arrInt;


    public int[][] level1(){

        return this.arrInt = new int[][]{
                {1, 0, 2, 0, 3},
                {0, 0, 4, 0, 5},
                {0, 0, 0, 0, 0},
                {0, 2, 0, 3, 0},
                {0, 1, 4, 5, 0}
        };
    }
}
