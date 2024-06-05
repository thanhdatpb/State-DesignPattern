package vn.edu.husc.s_maSinhVien;

public class ChuongTrinh {
    public static void main(String[] args) {
        // khởi tạo đối tượng điện thoại với trạng thái ban đầu là Chuẩn
        DienThoai dt = new DienThoai(new NormalState());

        // 1.a) thiết lập trạng thái Ngoài trời cho dt
        dt.setState(new OutdoorState());

        // 1.b) thử minh hoạ khi có tin nhắn đến cho dt
        dt.smsReceived();

        // 1.c) thử minh hoạ khi có sự kiện hệ thống cho dt
        dt.systemNotification();

        // 1.d) thử minh hoạ khi có cuộc gọi đến cho dt
        dt.incomingCall();

        // 2.a) thiết lập trạng thái Yên lặng cho dt
        dt.setState(new SilentState());

        // 2.b) thử minh hoạ khi có tin nhắn đến dt
        dt.smsReceived();

        // 2.c) thử minh hoạ khi có cuộc gọi đến cho dt
        dt.incomingCall();
    }
}