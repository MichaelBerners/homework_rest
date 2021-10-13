package ru.levelp.homework_rest.service;

import org.springframework.stereotype.Component;


public interface CalcServiceInt {

    String sum(String a, String b);

    String dif(String a, String b);

    String multiply(String a, String b);

    String div(String a, String b);
}
