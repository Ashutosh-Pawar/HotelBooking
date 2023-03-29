package com.example.myhotel.roomapi;

public interface RoomViewFetchMessage {
    void onUpdateSuccess(RoomModel message);
    void onUpdateFailure(String message);

}
