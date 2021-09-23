import java.util.*;

public class BattleShip {
    public static int rows = 6;
    public static int collumns = 6;
    public static int BattleShips;
    public static int Carrier;
    public static String[][] grid = new String[rows][collumns];


    public static void createGrid() {
        //First section
        System.out.print("  ");
        for (int i = 0; i < collumns; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("   _ _ _ _ _ _  ");

        //Middle section
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == null) {
                    grid[i][j] = "o ";
                }
                if (j == 0)
                    System.out.print(i + "| " + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        //Last section
        System.out.println("   _ _ _ _ _ _  ");
        System.out.print("  ");
        for (int i = 0; i < collumns; i++)
            System.out.print(i + " ");
        System.out.println();
    }

    //Print the last grid
    public static void printGrid() {
        System.out.println();
        //First section of Grid
        System.out.print("  ");
        for (int i = 0; i < collumns; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("   _ _ _ _ _ _  ");

        //Middle section of Grid
        for (int x = 0; x < grid.length; x++) {
            System.out.print(x + "| ");

            for (int y = 0; y < grid[x].length; y++) {
                System.out.print(grid[x][y]);
            }

            System.out.println("|" + x);
        }

        //Last section of Grid
        System.out.println("   _ _ _ _ _ _  ");
        System.out.print("  ");
        for (int i = 0; i < collumns; i++)
            System.out.print(i + " ");
        System.out.println();
    }
}