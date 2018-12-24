import java.util.ArrayList;

public class Solution {

    public int maxNumber(int[] array) {               // task 1
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        return array[array.length - 1];
    }

    public double average(int[] array) {              // task 2
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;

    }

    public ArrayList<String> makeCapitalLetters(ArrayList<String> list) {        // task 3
        ArrayList<String> changedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            changedList.add(list.get(i).toUpperCase());
        }
        return changedList;
    }

    public int sumOfElevenElements(int[] array) {        // task 4
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += array[i];
        }
        return sum;
    }

    public String getLongestCommonSubsequence(String str1, String str2) {       // task 5
        if (str1.length() == 0 || str2.length() == 0) {
            return "";
        } else if (str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) {
            return getLongestCommonSubsequence(str1.substring(0, str1.length() - 1), str2.substring(0, str2.length() - 1)) + str1.charAt(str1.length() - 1);
        } else {
            String cuttedString1 = getLongestCommonSubsequence(str1, str2.substring(0, str2.length() - 1));
            String cuttedString2 = getLongestCommonSubsequence(str1.substring(0, str1.length() - 1), str2);
            {
                if (cuttedString1.length() > cuttedString2.length()) {
                    return cuttedString1;
                } else return cuttedString2;
            }
        }
    }

    public void loop(int N) {           // task 6
        int result = 0;
        if (N >= 2 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }
        } else {
            System.out.println("ERROR");
        }
    }


}