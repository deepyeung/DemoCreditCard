package com.example.democreditcard.interfaces;

import com.example.democreditcard.models.Gift;


public interface GiftService {

    Gift saveGift(Gift gift);

    Gift getGift(Gift gift);

    Gift deleteGiftById(long giftSerial);
}
