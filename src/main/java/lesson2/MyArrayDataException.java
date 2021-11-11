package lesson2;

public class MyArrayDataException extends Exception {
    int indexI, indexJ;

    MyArrayDataException(int i, int j) {
        indexI = i;
        indexJ = j;
    }

    @Override
    public String toString() {
        return " MyArrayDataException in array[" + indexI + "][" + indexJ +"]";
    }

}
