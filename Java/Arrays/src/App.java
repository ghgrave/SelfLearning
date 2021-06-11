import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        // creates in memory space for 10 values in an array
        int[] values = new int[10];

        Random rand = new Random();
        
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(1000);
        }

        for(int num: values){
            System.out.println(num);
        }

        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "and";
        words[2] = "Goodbye";

        for (String string : words) {
            System.out.println(string);
        }

        String[] pets = {"cat", "dog", "bird", "mouse"};

        for (String string : pets) {
            System.out.println(string);
        }
    
    }
}
