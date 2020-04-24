package com.github.service.controller;

import com.github.utils.CollectionConvert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    private static final List<String> NAMES = new ArrayList<String>() {{
        add("Nuno");
        add("Diogo");
        add("Ana");
        add("Reis");
        add("Hugo");
        add("Ricardo");
        add("Lira");
        add("Tiago");
        add("Hugo");
    }};

    @GetMapping("/names")
    public String getName(@RequestParam(value = "index") Integer index) {

        Map<Integer, String> mappingNames = CollectionConvert.convert(NAMES);

        return mappingNames.get(index);
    }

}
