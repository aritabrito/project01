package org.academiadecodigo.hexallents.gameEngine;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Level {

    private Level() {
    }

    public static int[][] getLevel(int level) {
        switch (level) {
            case 1:
                return level1();
            case 2:
                return level2();
            case 3:
                return level3();
            case 4:
                return level4();
            case 5:
                return level5();
            case 6:
                return level6();
            case 7:
                return level7();
            case 8:
                return level8();
            default:
                throw new IllegalArgumentException("Level " + level + " doesn't exist");
        }
    }

    private static int[][] level1() {

        int red = ColorEnum.RED.ordinal();

        return new int[][]{
                {red, 2, 3, 0, 4, 5},
                {0, 0, 0, 0, 6, 0},
                {0, 0, 3, 0, 0, 0},
                {0, 0, 4, 0, 0, 0},
                {1, 0, 6, 0, 0, 0},
                {2, 0, 5, 0, 0, 0}
        };
    }

    private static int[][] level2() {
        return new int[][]{
                {1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {2, 0, 0, 3, 2, 0},
                {0, 0, 0, 0, 4, 0},
                {0, 4, 0, 0, 3, 0},
                {0, 0, 0, 0, 1, 0}
        };
    }

    private static int[][] level3() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 2, 0, 2, 3},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 3, 4},
                {4, 5, 0, 0, 5, 0},
                {0, 0, 0, 0, 0, 0}
        };
    }

    private static int[][] level4() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0},
                {1, 2, 0, 3, 0, 0},
                {0, 4, 0, 0, 0, 0},
                {0, 5, 0, 0, 0, 1},
                {0, 4, 0, 0, 3, 2},
                {5, 0, 0, 0, 0, 0}

        };
    }

    private static int[][] level5() {
        return new int[][]{
                {0, 0, 0, 0, 0, 1},
                {0, 2, 0, 0, 0, 3},
                {0, 4, 0, 4, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 5, 0, 5, 0},
                {1, 0, 2, 3, 0, 0}
        };
    }

    private static int[][] level6() {
        return new int[][]{
                {1, 0, 2, 0, 0, 3},
                {4, 0, 1, 4, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 5, 6, 0, 0, 0},
                {0, 6, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 3}
        };
    }

    private static int[][] level7() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0},
                {1, 2, 3, 4, 0, 0},
                {2, 0, 0, 5, 0, 0},
                {5, 0, 0, 0, 0, 1},
                {0, 3, 0, 0, 4, 6},
                {0, 0, 0, 6, 0, 0}
        };
    }

    private static int[][] level8() {
        return new int[][]{
                {1, 2, 0, 3, 4, 5},
                {0, 1, 0, 0, 0, 0},
                {6, 2, 0, 3, 0, 0},
                {0, 0, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {4, 5, 0, 0, 0, 0}
        };
    }

}
