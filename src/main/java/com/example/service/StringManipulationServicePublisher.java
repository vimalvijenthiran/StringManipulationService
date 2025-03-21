package com.example.service;

import jakarta.xml.ws.Endpoint;

public class StringManipulationServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/stringmanipulation", new StringManipulationServiceImpl());
        System.out.println("Service is published at http://localhost:8080/ws/stringmanipulation");
    }
}