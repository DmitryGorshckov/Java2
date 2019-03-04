package ru.gorshckov;
import ru.gorshckov.exceptions.MyArrayDataException;
import ru.gorshckov.exceptions.MyArraySizeException;

public class Array {

    private String[][] arr = new String[4][4];


    public void checkArray(String[][] arr1) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        int k;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if(!isNumber(arr1)){
                    throw new MyArrayDataException("Невозможно преобразовать в число, поменяйте формат ячейки");
                }
                k = Integer.parseInt(arr1[i][j]);
                sum = sum + k;
            }
        }
        System.out.println("Сумма чисел массива = "+sum);
    }

    public boolean isNumber(String[][] arr) throws MyArraySizeException {

        int size1 = arr.length;
        int size2 = arr[0].length;

        if (size1 != size2) {
            throw new MyArraySizeException("размер массива не 4x4, поменяйте размерность");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                }
               catch (NumberFormatException e){
                   System.out.println("не числовой формат, "+ arr[i][j]+ " ряд " +i + " столбец "+j);
                    return false;
               }
            }
        }
        return true;
    }

}

