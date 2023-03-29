package com.example.myhotel.roomapi;

public interface RoomViewMessage {

    void onUpdateFailure(String message);
    void onUpdateSuccess(String message);
}
