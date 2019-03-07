package ru.gorshckov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> map = new HashMap<>();

    private List<String> phonenumber;


    public void add(String surname, String phone_number) {

        if (map.containsKey(surname)) {

            phonenumber = map.get(surname);

            phonenumber.add(phone_number);

            map.put(surname, phonenumber);

        } else {

            phonenumber = new ArrayList<>();

            phonenumber.add(phone_number);

            map.put(surname, phonenumber);

        }

    }

    public List<String> get(String surname) {

        return map.get(surname);

    }

    @Override
    public String toString() {
        return "PhoneBook" + map;
    }
}
