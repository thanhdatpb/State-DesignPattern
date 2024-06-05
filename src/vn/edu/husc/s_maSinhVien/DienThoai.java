package vn.edu.husc.s_maSinhVien;

public class DienThoai {
    private State currentState;

    public DienThoai(State initialState) {
        this.currentState = initialState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void incomingCall() {
        currentState.onIncomingCall();
    }

    public void smsReceived() {
        currentState.onSMSReceived();
    }

    public void systemNotification() {
        currentState.onSystemNotification();
    }
}