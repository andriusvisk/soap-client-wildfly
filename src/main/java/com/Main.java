package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ValidateIbanService validateIbanService = new ValidateIbanService();
        ValidateIban validateIban = validateIbanService.getValidateIbanPort();

        String resp = validateIban.validate("MK07 2501 2000 0058 984");
        System.out.println(resp);

        List arr = new ArrayList<String>();
        arr.add("MK07250120000058984");
        arr.add("MK09250120000058984");
        resp = validateIban.validateList(arr);

        System.out.println(resp);
    }
}
