import java.util.Random;

/**
 * Created by Guest on 8/1/17.
 */
public class Game {
    int user1Score = 0;
    int user2Score = 0;

//    public Game(String user1, String user2) {
//        this.user1 = user1;
//        this.user2 = user2;
//    }

    public String userChooses(String name) {
        return name;
    }

    public int[] userChooses(String user1, String user2) {


        if(user1.equals(user2)){
            user1Score += 0;
            user2Score += 0;
        } else if (user1.equalsIgnoreCase("rock") && user2.equalsIgnoreCase("scissors")){
            user1Score += 1;
        } else if (user1.equalsIgnoreCase("rock") && user2.equalsIgnoreCase("paper")){
            user2Score += 1;
        } else if (user2.equalsIgnoreCase("rock") && user1.equalsIgnoreCase("scissors")){
            user2Score += 1;
        } else if (user2.equalsIgnoreCase("rock") && user1.equalsIgnoreCase("paper")){
            user1Score += 1;
        } else if (user2.equalsIgnoreCase("paper") && user1.equalsIgnoreCase("scissors")){
            user1Score += 1;
        } else if (user2.equalsIgnoreCase("scissors") && user1.equalsIgnoreCase("paper")){
            user2Score += 1;
        }
        int[] scoreArray = {user1Score,user2Score};


        return scoreArray;
    }

    public String computerGame() {
        String[] choices = {"rock", "scissors", "paper"};
        Random num = new Random();
        int randomNumber = num.nextInt(3);
        System.out.println(choices[randomNumber]);
        return choices[randomNumber];

    }

}
