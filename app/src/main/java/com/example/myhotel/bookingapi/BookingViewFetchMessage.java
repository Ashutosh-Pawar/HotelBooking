package com.example.myhotel.bookingapi;

public interface BookingViewFetchMessage {
    void onUpdateSuccess(BookingModel message);
    void onUpdateFailure(String message);
}
