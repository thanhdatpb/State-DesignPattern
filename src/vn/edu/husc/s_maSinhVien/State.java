package vn.edu.husc.s_maSinhVien;

public interface State {
    void onIncomingCall();
    void onSMSReceived();
    void onSystemNotification();
}