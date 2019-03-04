package ru.gorshckov;
import ru.gorshckov.exceptions.MyArrayDataException;
import ru.gorshckov.exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] args) {

        Array ar = new Array();

        String[][] arr = {{"1", "2", "3", "4"},
                         {"4", "5", "6", "7"},
                         {"7", "8", "9", "10"},
                         {"11", "12", "13", "14"}};



        try {

            ar.checkArray(arr);

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


    }
}
