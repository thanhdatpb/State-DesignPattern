package vn.edu.husc.s_maSinhVien;

public class SilentState implements State {
    @Override
    public void onIncomingCall() {
        Utils.rung();
    }

    @Override
    public void onSMSReceived() {
    }

    @Override
    public void onSystemNotification() {
    }
}