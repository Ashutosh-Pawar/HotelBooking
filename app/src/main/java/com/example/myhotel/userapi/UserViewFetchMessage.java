package com.example.myhotel.userapi;

public interface UserViewFetchMessage {
    void onUpdateSuccess(UserModel message);
    void onUpdateFailure(String message);
}
