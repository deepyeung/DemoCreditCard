package com.example.democreditcard.serviceImp;

import com.example.democreditcard.interfaces.GiftRepository;
import com.example.democreditcard.interfaces.GiftService;
import com.example.democreditcard.models.Gift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftImp implements GiftService {

    @Autowired(required = false)
    private GiftRepository giftRepository;

    @Override
    public Gift saveGift(Gift gift) {

        giftRepository.save(gift);
        return gift; //回傳小寫product,顯示下層postman
    }

    @Override
    public Gift getGift(Gift gift) {

        giftRepository.save(gift);
        return gift; //回傳小寫product
    }

    @Override
    public Gift deleteGiftById(long giftSerial) {

        this.giftRepository.deleteById(giftSerial);
        return null;
    }

}
