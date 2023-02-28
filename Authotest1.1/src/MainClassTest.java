import org.junit.Test;

public class MainClassTest {
    MainClass Num = new MainClass();
    @Test
    public void testGetLocalNumber() {
        int number = Num.getLocalNumber();
        if (number == 14) {
            System.out.println("Number is correct");
        } else {
            System.out.println("Number is wrong");
        }

    }
}
