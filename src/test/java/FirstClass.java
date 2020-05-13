import org.testng.annotations.Test;

public class FirstClass {
    @Test
    public void test00001() {
        System.out.println("welcome to java back");
    }

    @Test
    public void test00003() {
        String messageOne ="String for method 00003";

        String messageTwo = "string two two!";

        String messageThree = messageOne + messageTwo;

        System.out.println(messageThree);
    }

    @Test
    public void test004() {
        int num = 5;
        String message = "I have " + num + " cookies";

        System.out.println(message);
    }

    @Test
    public void test005() {
        boolean toBe = false;

        boolean b = true;
        if (b == false) System.out.println(!toBe);
        else {
            System.out.println(toBe);
        }

        int children = 0;


        int a = 0;
        b = true;
        boolean c = false;
        //The following line will give an error
        System.out.println(a);
    }

    //TODO: change to accept parameters so it will always print correct message
    @Test
    public void test006() {
        System.out.println("test006");
        int a = 4;

        if (a == 4) System.out.println("Ohhh! So a is four!!!");
        else {
            System.out.println("A IS NOT EQUAL TO 4");
        }
    }

    @Test
    public void test007() {
        int[] arrayOfIntegers = {1, 9, 9, 5};

        for (int currentElement : arrayOfIntegers) {
            System.out.println("current element is: " + currentElement);
        }
    }

    @Test
    public void test008() {
        System.out.println("Method number 0081");
    }
}

