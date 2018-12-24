import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maxNumber(new int[]{21, 5, 88, 96, 4, 5}));     // task 1

        System.out.println(" ");

        System.out.println(solution.average(new int[]{2, 5}));     // task 2

        System.out.println(" ");

        ArrayList<String> list = new ArrayList<>();     // task 3
        list.add("Hello");
        list.add("world");
        list.add("how are you?");
        System.out.println(solution.makeCapitalLetters(list));

        System.out.println(" ");
        // task 4
        System.out.println(solution.sumOfElevenElements(new int[]{1, 3, 55, 6, 7, 8, 23, 11, 55, 33, 22, 4, 5, 7, 8, 9, 12}));

        System.out.println(" ");

        System.out.println(solution.getLongestCommonSubsequence("My name is Danya", "I am Danya"));

        System.out.println(" ");

        solution.loop(5);     // task 6

        System.out.println(" ");

        Bird bird = new Bird();     // task 7
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println(" ");

        MyBook myBook = new MyBook();       // task 8
        myBook.setTitle("May the force be with you");
        System.out.println(myBook.getTitle());

        System.out.println(" ");

        MyCalculator calc = new MyCalculator();       // task 9
        try {
            calc.power(3, 5);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            calc.power(2, 4);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            calc.power(5, 0);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            calc.power(0, 0);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            calc.power(-3, 3);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }


}
