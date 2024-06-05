package vn.edu.husc.s_maSinhVien;

public class OutdoorState implements State {
    @Override
    public void onIncomingCall() {
        Utils.rung();
        Utils.rung();
        Utils.rung();
        Utils.phatAmThanh(100, 5);
    }

    @Override
    public void onSMSReceived() {
        Utils.phatAmThanh(100, 1);
    }

    @Override
    public void onSystemNotification() {
        Utils.phatAmThanh(90, 1);
    }
}