public class Multiples {
        public static void main (String[]args){
        int m = 0;
        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {

                m += 1;

            } else {

                m += 0;

            }
        }
        System.out.println(m);
    }
    }