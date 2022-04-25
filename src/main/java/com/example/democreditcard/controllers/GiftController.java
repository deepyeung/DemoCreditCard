package com.example.democreditcard.controllers;

import com.example.democreditcard.interfaces.GiftService;
import com.example.democreditcard.models.Gift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GiftController {

    @Autowired(required = false)
    private GiftService giftService;


    @PostMapping("/gift/add")
    public Gift add(@RequestBody Gift gift) {
        System.out.println("傳進去" + gift.getGiftTitle());//檢測傳進去的數據
        giftService.saveGift(gift);
        return gift;
    }

    @GetMapping("/gift/all")
    public Gift get(@RequestBody Gift gift) {
        System.out.println("取出來" + gift.getGiftCode());//檢測取出來的數據
        giftService.getGift(gift);
        return gift;
    }

    @DeleteMapping("/gift/{giftSerial}")
    public void delete(@PathVariable(value = "giftSerial") long giftSerial) {
        System.out.println("刪除" + giftSerial);
        giftService.deleteGiftById(giftSerial);
    }

}
