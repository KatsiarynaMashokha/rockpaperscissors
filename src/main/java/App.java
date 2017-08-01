import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Game game = new Game();
//        boolean exit = true;
//
//        try {
//
//            while(exit) {
//                System.out.println("User 1: Select 'rock', 'paper', or 'scissors' or 'exit'");
//                String user1 = bufferedReader.readLine().trim();
//                if (user1.equalsIgnoreCase("exit")) {
//                    System.out.println("goodbye");
//                    exit = false;
//                    break;
//                }
//                System.out.println("User 2: Select 'rock', 'paper', or 'scissors' or 'exit'");
//                String user2 = bufferedReader.readLine().trim();
//                if(user2.equalsIgnoreCase("exit")){
//                    exit = false;
//                }
//
//                int[] scoreArray = game.userChooses(user1, user2);
//                for (int num : scoreArray) {
//                    System.out.println(num);
//                }
//            }
//            //System.out.println(game.userChooses());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



        game.computerGame();
        game.computerGame();
        game.computerGame();
        game.computerGame();
        game.computerGame();
        game.computerGame();
        game.computerGame();
        game.computerGame();


   }




}
