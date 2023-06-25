import Helper.CharacterMatcher;

import java.util.Arrays;
import java.util.Random;

public class Lesson10Program {
    public static void main(String[] args) {

//        Human human1 = new Human(){
//            {
//                name = "Anatoliy";
//                sex = true;
//                age = 32;
//            }
//        };
//        System.out.println(human1);
        Integer[][] matrix = fillMatrix(5,10);
        int sumFirst = 0;
        int sumLast = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        for (int i = 0; i < matrix.length; i++) {
            sumFirst +=sumPart(matrix[i], 5);
            Integer[] reversArray = reverseArray(matrix[i]);
            sumLast +=sumPart(reversArray, 5);
        }
        System.out.println(sumFirst);
        System.out.println(sumLast);
//        String str1 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ut blanditiis illum natus tempora voluptate placeat.";
//        String str2 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum odit ipsum, facilis unde temporibus, error eveniet.";
//        //System.out.println(Arrays.toString(matchChars(str1, str2)));
//        CharacterMatcher[] matchers = matchChars(str1, str2);
//        for (CharacterMatcher matcher :
//                matchers) {
//            if (matcher != null)
//                System.out.print(matcher + " ");
//        }
//        System.out.println(Arrays.toString(getPairArray(20)));
//        System.out.println(Arrays.toString(getEvenArray(19)));
//        Human human = new Human("Anna", false, 24, "developer");
//        System.out.println(human);
//        System.out.println((multiplyAB(4, 5)));
//        long a = 4l;
//        int b = 4;
//        System.out.println(multiplyAB(a, b));
//        System.out.println(multiplyAB(b, a));
    }

    public static long multiplyAB(int a, int b) {
        long res = a * b;
        return res;
    }

    public static long multiplyAB(long a, int b) {
        long res = a * b;
        return res;
    }

    public static long multiplyAB(int a, long b) {
        long res = a * b;
        return res;
    }

    public static long multiplyAB(short a, int b) {
        long res = a * b;
        return res;
    }

    public static long multiplyAB(int a, byte b) {
        long res = a * b;
        return res;
    }

    // кількість чисел 20
    public static int[] getPairArray(int num) {
        int[] result = new int[num / 2];
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static int[] getEvenArray(int num) {
        int[] result = new int[num / 2];
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static CharacterMatcher[] matchChars(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int lengthArray = Math.min(chars1.length, chars2.length);
        CharacterMatcher[] saveData = new CharacterMatcher[lengthArray];

        int count = 0;
        int index = 0;
        for (int i = 0; i < lengthArray; i++) {
            if (chars1[i] == chars2[i]) {
                CharacterMatcher matcher = new CharacterMatcher(i, chars1[i]);
                saveData[index] = matcher;
                count++;
                index++;
            }
        }
        System.out.println("Matches = " + count);
        return saveData;
    }

    public static Integer[][] fillMatrix(int n, int m){
        Random random = new Random();
        Integer[][] matrixTemp = new Integer[n][m];
        for (int i = 0; i < matrixTemp.length; i++) {
            for (int j = 0; j < matrixTemp[i].length; j++) {
                matrixTemp[i][j] = random.nextInt(10) + 1;
            }
        }
        return matrixTemp;
    }
    public static int sumPart(Integer[] arr, int length){
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static Integer[] reverseArray(Integer[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -i - 1];
            arr[arr.length -i - 1] = temp;
        }
        return arr;
    }
}
