import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class GameTest {
//    @Test
//    public void userChooses_shouldBeAString_true() throws Exception {
//        Game testGame = new Game();
//        String userChoice =  testGame.userChooses("rock");
//        assertEquals(true, userChoice instanceof String);
//    }
    @Test
    public void usersChooseSameValue_true() throws Exception {
        String userChoice1 = "rock";
        String userChoice2 = "rock";
        Game testGame = new Game();
        int[] testArray = {0,0};
        assertArrayEquals(testArray, testGame.userChooses(userChoice1,userChoice2));
    }
    @Test
    public void users1rockuser2paper_false() throws Exception {
        String userChoice1 = "rock";
        String userChoice2 = "paper";
        Game testGame = new Game();
        int[] testArray = {0,1};
        assertArrayEquals(testArray, testGame.userChooses(userChoice1,userChoice2));
    }
    @Test
    public void user1RockUser2Scissors_false() throws Exception {
        String userChoice1 = "rock";
        String userChoice2 = "scissors";
        Game testGame = new Game();
        int[] testArray = {1,0};
        assertArrayEquals(testArray, testGame.userChooses(userChoice1,userChoice2));
    }
    @Test
    public void user1ScissorsUser2Paper_false() throws Exception {
        String userChoice1 = "scissors";
        String userChoice2 = "paper";
        Game testGame = new Game();
        int[] testArray = {1,0};
        assertArrayEquals(testArray, testGame.userChooses(userChoice1,userChoice2));
    }
    @Test
    public void user1ScissorsUser2Rock_false() throws Exception {
        String userChoice1 = "scissors";
        String userChoice2 = "rock";
        Game testGame = new Game();
        int[] testArray = {0,1};
        assertArrayEquals(testArray, testGame.userChooses(userChoice1,userChoice2));
    }
    @Test
    public void user1PaperUser2Scissors_false() throws Exception {
        String userChoice1 = "paper";
        String userChoice2 = "scissors";
        Game testGame = new Game();
        int[] testArray = {0,1};
        assertArrayEquals(testArray, testGame.userChooses(userChoice1,userChoice2));
    }
    @Test
    public void user1PaperUser2Rock_false() throws Exception {
        String userChoice1 = "paper";
        String userChoice2 = "rock";
        Game testGame = new Game();
        int[] testArray = {1,0};
        assertArrayEquals(testArray, testGame.userChooses(userChoice1,userChoice2));
    }
}