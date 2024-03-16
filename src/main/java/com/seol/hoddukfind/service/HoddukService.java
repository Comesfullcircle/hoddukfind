package com.seol.hoddukfind.service;

import com.seol.hoddukfind.entity.HoddukHouse;
import com.seol.hoddukfind.model.HoddukHouseRequest;
import com.seol.hoddukfind.repository.HoddukHouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HoddukService {
    private final HoddukHouseRepository hoddukHouseRepository;

    public void setHoddukHouse(HoddukHouseRequest request){
        HoddukHouse addData = new HoddukHouse();
        addData.setPosX(request.getPosX());
        addData.setPosY(request.getPosY());
        addData.setAddressKor(request.getAddressKor());
        addData.setPerPrice(request.getPerPrice());

        hoddukHouseRepository.save(addData);
    }
}
