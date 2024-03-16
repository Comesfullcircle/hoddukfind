package com.seol.hoddukfind.controller;

import com.seol.hoddukfind.model.HoddukHouseRequest;
import com.seol.hoddukfind.service.HoddukService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hodduk")
public class HoddukController {
    private final HoddukService hoddukService;

    @PostMapping("/new")
    public String setHoddukHouse(@RequestBody HoddukHouseRequest request) {
        hoddukService.setHoddukHouse(request);

        return "OK";
    }
}
