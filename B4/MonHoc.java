public class MonHoc extends KeHoachHocTap {
    public int hocPhi;
    public int soTC;
    String prefix = " ";

    public MonHoc(String ten, int hocPhi, int soTC) {
        super(ten);
        this.hocPhi = hocPhi;
        this.soTC = soTC;
    }

    @Override
    public int getHocPhi() {
        return this.soTC * hocPhi;
    }

    @Override
    public int getSoTinChi() {
        return this.soTC;
    }

    @Override
    public KeHoachHocTap them(KeHoachHocTap k) {
        return null;
    }

    @Override
    public String thongTin() {
        // TODO Auto-generated method stub
        StringBuilder builder = new StringBuilder();
        builder.append(this.prefix).append(this.ten).append(", so tin chi:").append(getSoTinChi()).append(", hoc phi:")
                .append(getHocPhi());
        return builder.toString();
    }

    @Override
    public void xoa(KeHoachHocTap k) {
        // TODO Auto-generated method stub

    }

}
