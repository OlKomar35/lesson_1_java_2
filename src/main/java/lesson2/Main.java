package lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = {{"1", "2", "3", "4"}, {"2", "2", "3", "5"}, {"0","0", "2", "4"}, {"1", "2", "3", "4"}};
        try {
            sumArray(array);
        } catch (MyArraySizeException e) {
            System.out.println("Exception:" + e);
        } catch (MyArrayDataException e) {
            System.out.println("Exception:" + e);
        }
    }

    public static void sumArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int i = 0;
        int j = 0;
        int sum = 0;


        if (arr.length < 4 || arr[0].length < 4 || arr[1].length < 4 || arr[2].length < 4 || arr[3].length < 4) {
            throw new MyArraySizeException();
        }
        int[][] arrayInt = new int[4][4];
        try {
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    arrayInt[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arrayInt[i][j];
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i,j);
        }
        System.out.println("Sum of all array elements=" + sum + ";");
        }
    }
