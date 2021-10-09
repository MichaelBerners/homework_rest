package ru.levelp.homework_rest.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

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

    public String multiply(String a, String b) {
        int sum;
        String line;
        try {
            sum = Integer.parseInt(a) * Integer.parseInt(b);
            line = "Произведение введеных чисел : " + sum;

        }
        catch (NumberFormatException e) {
            line = "Вы ввели некорректное число";
        }
        return line;

    }

    public String div(String a, String b) {
        double sum;
        String line;
        try {
            sum = Double.parseDouble(a) / Double.parseDouble(b);
            line = "Частное введеных чисел : " + sum;

        }
        catch (NumberFormatException e) {
            line = "Вы ввели некорректное число";
        }
        return line;

    }


}
