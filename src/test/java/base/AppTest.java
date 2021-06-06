package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void outputStringHasUserInputAndCorrectCharaterCount() {
        App myApp = new App();
        String userInput = "Homer";

        String expectedOutput = "Homer has 5 characters.";
        String actualOutput = myApp.createOutputString(userInput, userInput.length());

        assertEquals(expectedOutput, actualOutput);
    }
}