package com.raphau.springboot.stockExchange.service;

import com.raphau.springboot.stockExchange.dto.SellOfferDTO;
import com.raphau.springboot.stockExchange.dto.TestDetailsDTO;

import java.util.Map;

public interface SellOfferService {

    Map<String, Object> getUserSellOffers();
    TestDetailsDTO deleteSellOffer(int theId);
    TestDetailsDTO addSellOffer(SellOfferDTO sellOfferDTO);

}
