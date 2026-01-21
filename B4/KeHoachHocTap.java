
public abstract class KeHoachHocTap {
    String ten;

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract KeHoachHocTap them(KeHoachHocTap k);

    public abstract void xoa(KeHoachHocTap k);

    public abstract int getHocPhi();

    public abstract int getSoTinChi();

    public abstract String thongTin();
}