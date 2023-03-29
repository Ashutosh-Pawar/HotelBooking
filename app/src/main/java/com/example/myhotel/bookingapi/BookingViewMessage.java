package com.example.myhotel.bookingapi;

public interface BookingViewMessage {
    void onUpdateFailure(String message);
    void onUpdateSuccess(String message);
}
