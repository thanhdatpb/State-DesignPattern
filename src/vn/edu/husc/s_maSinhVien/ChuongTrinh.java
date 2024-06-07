package vn.edu.husc.s_maSinhVien;

public class ChuongTrinh {
    public static void main(String[] args) {
        // khởi tạo đối tượng điện thoại với trạng thái ban đầu là Chuẩn
        DienThoai dt = new DienThoai(new NormalState());

        //Thiết lập trạng thái Ngoài trời cho dt
        dt.setState(new OutdoorState());

        //Thử minh hoạ khi có tin nhắn đến cho dt
        dt.smsReceived();

        //Thử minh hoạ khi có sự kiện hệ thống cho dt
        dt.systemNotification();

        //Thử minh hoạ khi có cuộc gọi đến cho dt
        dt.incomingCall();

        //Thiết lập trạng thái Yên lặng cho dt
        dt.setState(new SilentState());

        //Thử minh hoạ khi có tin nhắn đến dt
        dt.smsReceived();

        //Thử minh hoạ khi có cuộc gọi đến cho dt
        dt.incomingCall();
    }
}