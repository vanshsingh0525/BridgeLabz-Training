package com.smartcity.utils;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance, double baseFare, boolean isPeak);
}
