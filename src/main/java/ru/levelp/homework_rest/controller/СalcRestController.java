package ru.levelp.homework_rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.levelp.homework_rest.service.CalcServiceInt;

@RestController
@RequestMapping("/calc")
@AllArgsConstructor
public class СalcRestController {

    private final CalcServiceInt calcService;

    @GetMapping("/{name}")
    public String seyHello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/sum/{arg1}/{arg2}")
    public String getSum(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2) {
        return calcService.sum(arg1, arg2);
    }

    @GetMapping("/dif/{arg1}/{arg2}")
    public String getDif(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2) {
        return calcService.dif(arg1, arg2);
    }

    @GetMapping("/multiply/{arg1}/{arg2}")
    public String getMultiply(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2) {
        return calcService.multiply(arg1, arg2);
    }

    @GetMapping("/div/{arg1}/{arg2}")
    public String getDiv(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2) {
        return calcService.div(arg1, arg2);
    }
}

