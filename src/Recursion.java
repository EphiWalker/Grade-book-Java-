public class Recursion {
    public int recursion(int someValue) {
        if (someValue == 10) {
            return someValue;
        }

        return recursion(someValue+1);
    }
}
