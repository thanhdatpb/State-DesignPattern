package vn.edu.husc.s_maSinhVien;

public class NormalState implements State {
    @Override
    public void onIncomingCall() {
        Utils.rung();
        Utils.phatAmThanh(80, 3);
    }

    @Override
    public void onSMSReceived() {
        Utils.phatAmThanh(60, 1);
    }

    @Override
    public void onSystemNotification() {
        Utils.phatAmThanh(50, 1);
    }
}