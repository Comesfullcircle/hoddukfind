package com.seol.hoddukfind.controller;

import com.seol.hoddukfind.model.HoddukHouseItem;
import com.seol.hoddukfind.model.HoddukHouseRequest;
import com.seol.hoddukfind.service.HoddukService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public List<HoddukHouseItem> gethoddukHose(){
        return hoddukService.getHoddukHouse();
    }

}
