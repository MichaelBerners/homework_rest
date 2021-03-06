package ru.levelp.homework_rest.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class CalcService implements CalcServiceInt {

    @Override
    public String sum(String a, String b) {
        int sum;
        String line;
        try {
            sum = Integer.parseInt(a) + Integer.parseInt(b);
            line = "Сумма введеных чисел : " + sum;

        }
        catch (NumberFormatException e) {
            line = "Вы ввели некорректное число";
        }
        return line;

    }

    @Override
    public String dif(String a, String b) {
        int dif;
        String line;
        try {
            dif = Integer.parseInt(a) - Integer.parseInt(b);
            line = "Разность введеных чисел : " + dif;

        }
        catch (NumberFormatException e) {
            line = "Вы ввели некорректное число";
        }
        return line;

    }

    @Override
    public String multiply(String a, String b) {
        int multiply;
        String line;
        try {
            multiply = Integer.parseInt(a) * Integer.parseInt(b);
            line = "Произведение введеных чисел : " + multiply;

        }
        catch (NumberFormatException e) {
            line = "Вы ввели некорректное число";
        }
        return line;

    }

    @Override
    public String div(String a, String b) {
        double div;
        String line;
        try {
            div = Double.parseDouble(a) / Double.parseDouble(b);
            line = "Частное введеных чисел : " + div;

        }
        catch (NumberFormatException e) {
            line = "Вы ввели некорректное число";
        }
        return line;

    }

}
