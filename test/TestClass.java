public class TestClass extends TestSuite {
    @Override
    protected void testList() {
        testIntPassed();
        testIntFailed();
        testDoublePassed();
        testDoubleFailed();
        testStringPassed();
        testStringFailed();
    }

    public void testIntPassed() {
        int result = 5;
        assertEquals(5, result);
    }

    public void testIntFailed() {
        assertEquals(3, 7);
    }

    public void testDoublePassed() {
        double result = 7.6;
        assertEquals(7.6, result, 0.001);
    }

    public void testDoubleFailed() {
        double result = 5.1;
        assertEquals(1.1, result, 0.001);
    }

    public void testStringPassed() {
        String result = "Pass";
        assertEquals("Pass", "Pass");
    }

    public void testStringFailed() {
        String result = "Pass";
        assertEquals("Fail", "Pass");
    }
}
