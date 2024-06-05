package vn.edu.husc.s_maSinhVien;

public class SilentState implements State {
    @Override
    public void onIncomingCall() {
        Utils.rung();
    }

    @Override
    public void onSMSReceived() {
        // Không làm gì
    }

    @Override
    public void onSystemNotification() {
        // Không làm gì
    }
}