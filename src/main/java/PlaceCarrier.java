import java.util.Scanner;

public class PlaceCarrier {

    public static void placeCarrier() {
        Scanner input = new Scanner(System.in);
        BattleShip.Carrier = 2;
        for (int i = 1; i <= BattleShip.Carrier; ) {
            System.out.print("Enter X coordinate for your " + i + " Carrier: ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate for your " + i + " Carrier: ");
            int y = input.nextInt();

            System.out.println("In welche Richtung willst du dein Carrier?");
            System.out.println("o = oben, u = unten, l = links, r = rechts.");
            Scanner input2 = new Scanner(System.in);
            String direction = input2.next();

            switch (direction) {
                case "o":
                    if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o ")) {
                        BattleShip.grid[x][y] = "X ";
                        BattleShip.grid[x - 1][y] = "X ";
                        BattleShip.grid[x - 2][y] = "X ";
                        i++;
                    }
                    break;
                case "u":
                    if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o ")) {
                        BattleShip.grid[x][y] = "X ";
                        BattleShip.grid[x + 1][y] = "X ";
                        BattleShip.grid[x + 2][y] = "X ";
                        i++;
                    }
                    break;
                case "l":
                    if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o ")) {
                        BattleShip.grid[x][y] = "X ";
                        BattleShip.grid[x][y - 1] = "X ";
                        BattleShip.grid[x][y - 2] = "X ";
                        i++;
                    }
                    break;
                case "r":
                    if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o ")) {
                        BattleShip.grid[x][y] = "X ";
                        BattleShip.grid[x][y + 1] = "X ";
                        BattleShip.grid[x][y + 2] = "X ";
                        i++;
                    }
                    break;
                default:
                    System.out.println("Falsche eingabe");
                    break;
            }
        }
        BattleShip.printGrid();
    }
}
