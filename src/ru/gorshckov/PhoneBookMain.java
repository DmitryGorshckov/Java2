package ru.gorshckov;

public class PhoneBookMain {

    public static void main(String[] args) {

        PhoneBook ph = new PhoneBook();

        ph.add("sidorov","345678");
        ph.add("sidorov","345000");
        ph.add("petrov","367867");
        ph.add("ivanov","999999");
        ph.add("smirnov","343435");
        ph.add("petrov","000888");

        System.out.println(ph);

        System.out.println(ph.get("sidorov"));

    }
}
