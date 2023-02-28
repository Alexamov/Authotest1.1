import org.junit.Test;

public class MainClass {
    @Test
    public void testGetLocalNumber() {
    int number = this.getLocalNumber();
    if (number == 14) {
        System.out.println("Number is correct");
    } else {
        System.out.println("Number is wrong");
    }

    }
    public int getLocalNumber() {
        return 14;
    }

}
