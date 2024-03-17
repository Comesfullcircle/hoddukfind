package com.seol.hoddukfind.service;

import com.seol.hoddukfind.entity.HoddukHouse;
import com.seol.hoddukfind.model.HoddukHouseItem;
import com.seol.hoddukfind.model.HoddukHouseRequest;
import com.seol.hoddukfind.repository.HoddukHouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

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

    public List<HoddukHouseItem> getHoddukHouse() {
        // 데이터베이스에서 전체 데이터 가져오기
        List<HoddukHouse> hoddukHouses = hoddukHouseRepository.findAll();

        List<HoddukHouseItem> result = new LinkedList<>();

        for (HoddukHouse house : hoddukHouses){
            HoddukHouseItem addItem = new HoddukHouseItem();
            addItem.setPosX(house.getPosX());
            addItem.setPosY(house.getPosY());
            addItem.setAddressKor(house.getAddressKor());
            addItem.setPerPrice(house.getPerPrice());

            result.add(addItem);
        }

        return result;
    }
}
