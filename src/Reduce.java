public class Reduce {
    public static void main (String[]args){
        int m = 100;
        int i = 0;
        while (m != 0) {

            // Find out which numbers divide i.
            boolean divisibleBy2 = m % 2 == 0;

            // Print our appropriate result.
            if (divisibleBy2) {

                m = m / 2;

            } else {
                m = 0;
                i += 1;
            }
            i += 1;
        }
        System.out.println(i);
    }
}