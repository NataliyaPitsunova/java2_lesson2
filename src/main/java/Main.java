import Exception.MyArrayDataException;
import Exception.MyArraySizeException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {


        String[][] arrays1 = new String[][]{
                {"2", "3", "4"},
                {"5", "6", "7", "8"},
                {"11", "12", "13", "14"},
                {"15", "16", "17", "18"}
        };

        String[][] arrays2 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"11", "12", "13", "14"},
                {"15", "16", "17", "18"}
        };

        String[][] arrays3 = new String[][]{
                {"1", "dd", "3", "4"},
                {"5", "6", "7", "8"},
                {"11", "12", "13", "14"},
                {"15", "16", "17", "18"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + arraysExceptionAndSumm(arrays1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + arraysExceptionAndSumm(arrays2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + arraysExceptionAndSumm(arrays3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int arraysExceptionAndSumm(String[][] inArr) throws MyArraySizeException, MyArrayDataException {
        int size = 4;
        int summ = 0;
        if (inArr.length != 4) {
            throw new MyArraySizeException("Размерность массива должна быть", size);
        }
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i].length != 4) {
                throw new MyArraySizeException("Размерность массива должна быть ", size);
            }
        }

        for (int i = 0; i < inArr.length; i++) {
            for (int j = 0; j < inArr.length; j++) {
                try {
                    summ += Integer.parseInt(inArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать данные массива в ячейке", i, j);
                }
            }
        }
        return summ;
    }


}



