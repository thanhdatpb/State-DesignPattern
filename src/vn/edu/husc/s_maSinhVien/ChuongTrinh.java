package vn.edu.husc.s_maSinhVien;

public class ChuongTrinh {
    public static void main(String[] args) {
        // khởi tạo đối tượng điện thoại với trạng thái ban đầu là Chuẩn
        DienThoai dt = new DienThoai(new NormalState());

        //thiết lập trạng thái Ngoài trời cho dt
        dt.setState(new OutdoorState());

        //thử minh hoạ khi có tin nhắn đến cho dt
        dt.smsReceived();

        //thử minh hoạ khi có sự kiện hệ thống cho dt
        dt.systemNotification();

        //thử minh hoạ khi có cuộc gọi đến cho dt
        dt.incomingCall();

        //thiết lập trạng thái Yên lặng cho dt
        dt.setState(new SilentState());

        //thử minh hoạ khi có tin nhắn đến dt
        dt.smsReceived();

        //thử minh hoạ khi có cuộc gọi đến cho dt
        dt.incomingCall();
    }
}