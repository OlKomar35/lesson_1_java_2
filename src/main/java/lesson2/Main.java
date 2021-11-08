package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "2", "3","5"}, {"1", "2", "1", "4"}, {"1", "2", "3", "4"}};
        sumArray(array);
    }

    public static void sumArray(String[][] arr) {
        int i = 0;
        int j = 0;
        int sum = 0;

        int count=0;
        try {
            int a = arr.length;
            if (a != 4) a = a / (a - a);
            for (i = 0; i < arr.length; i++) {
                int b = arr[i].length;
                if (b != 4) b = b / (b - b);
            }
            int[][] arrayInt = new int[4][4];

            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    arrayInt[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arrayInt[i][j];
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception: MyArraySizeException;"); count++;
        } catch (NumberFormatException e) {
            System.out.println("Exception:MyArrayDataException in array[" + i + "][" + j + "];"); count++;
        }
        if (count==0) System.out.println("Sum of all array elements=" +sum+";");
        else System.out.println("An error has occurred the amount cannot be calculated.");

    }
}
