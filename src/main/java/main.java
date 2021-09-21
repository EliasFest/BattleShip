public class main {

    public static void main(String[] args) {
        System.out.println("Welcome to BattleShips");
        System.out.println("You have 2x Carrier and 2x Battleship");
        System.out.println("Carrier size: 3");
        System.out.println("Battleship size: 2");
        //Create Grid
        BattleShip.createGrid();
        //Place ships
        BattleShip.placeShips();

    }
}
