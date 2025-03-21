package com.example.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.example.service.StringManipulationService")
public class StringManipulationServiceImpl implements StringManipulationService {

    @Override
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        return text.length();
    }
}