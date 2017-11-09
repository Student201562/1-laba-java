import java.lang.Integer;
public class Print {
    public static void printGameField(Game game){

        for (int i = 0; i < game.lenghtMasive(); i++) {
            System.out.print("\t\t\t");
            for (int j = 0; j < game.lenghtMasive(); j++) {
                System.out.print("|");
                System.out.print(game.getFromIndex(i,j));
                System.out.print("| ");
            }
            System.out.println();
        }

    }
}
