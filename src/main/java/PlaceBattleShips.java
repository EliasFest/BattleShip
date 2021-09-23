import java.util.Scanner;

public class PlaceBattleShips {

    public static void placeBattleShips() {
        Scanner input = new Scanner(System.in);
        BattleShip.BattleShips = 2;
        for (int i = 1; i <= BattleShip.BattleShips; ) {
            BattleShip.createGrid();
            System.out.print("Enter X coordinate for your " + i + " BattleShip: ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate for your " + i + " BattleShip: ");
            int y = input.nextInt();

            System.out.println("In welche Richtung willst du dein BattleShip?");
            System.out.println("o = oben, u = unten, l = links, r = rechts.");
            Scanner input2 = new Scanner(System.in);
            String direction = input2.next();

                switch (direction) {
                    case "o":
                        if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o " && (!BattleShip.grid[x][y].equals("X ") && !BattleShip.grid[x - 1][y].equals("X ")))) {
                            BattleShip.grid[x][y] = "X ";
                            BattleShip.grid[x - 1][y] = "X ";
                            i++;
                        } else {
                            System.out.println("Dort ist schon ein Schiff.");
                        }
                        break;
                    case "u":
                        if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o " && (!BattleShip.grid[x][y].equals("X ") && !BattleShip.grid[x + 1][y].equals("X ")))) {
                            BattleShip.grid[x][y] = "X ";
                            BattleShip.grid[x + 1][y] = "X ";
                            i++;
                        }
                        break;
                    case "l":
                        if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o " && (!BattleShip.grid[x][y].equals("X ") && !BattleShip.grid[x][y - 1].equals("X ")))) {
                            BattleShip.grid[x][y] = "X ";
                            BattleShip.grid[x][y - 1] = "X ";
                            i++;
                        }
                        break;
                    case "r":
                        if ((x >= 0 && x < BattleShip.rows) && (y >= 0 && y < BattleShip.collumns) && (BattleShip.grid[x][y] == "o " && (!BattleShip.grid[x][y].equals("X ") && !BattleShip.grid[x][y + 1].equals("X ")))) {
                            BattleShip.grid[x][y] = "X ";
                            BattleShip.grid[x][y + 1] = "X ";
                            i++;
                        }
                        break;
                    default:
                        System.out.println("Falsche eingabe");
                        break;
                }
            }
        BattleShip.createGrid();
        }
    }
