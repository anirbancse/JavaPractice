package com.javatechie.java8;

public enum ApiError {
    API_ERROR_212("212", 904, "Anirban"),
    API_ERROR_213("213", 213, "Arka");

    private String code;
    private int httpStatus;
    private String payload;

    ApiError(String code, int httpStatus, String payload) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "ApiError{" +
                "code='" + code + '\'' +
                ", httpStatus=" + httpStatus +
                ", payload='" + payload + '\'' +
                '}';
    }
}
