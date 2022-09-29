public class NumberTester
{
    private NumberTest palindromeTester;
    private NumberTest oddTester;
    private NumberTest primeTester;

    public NumberTester(String filename) {

    }

    public void setOddEvenTester(NumberTest oddTester)
    {
        this.oddTester = oddTester ;
        System.out.println("ODD");
    }

    public void setPrimeTester(NumberTest primeTester )
    {
        this.primeTester = primeTester;
        System.out.println("PRIME");
    }

    public void setPalindromeTester (NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
        System.out.println("PALINDROME");
    }
    public void testFile ()
    {
        //TODO
    }
}


