import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap {
    List<KeHoachHocTap> khhts = new ArrayList<KeHoachHocTap>();

    public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    public int getHocPhi() {
        int ht = 0;
        for (var k : khhts) {
            ht += k.getHocPhi();
        }
        return ht;
    }

    @Override
    public int getSoTinChi() {
        int stc = 0;
        for (var k : khhts) {
            stc += k.getSoTinChi();
        }
        return stc;
    }

    @Override
    public KeHoachHocTap them(KeHoachHocTap k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String thongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten).append(", so tin chi:").append(getSoTinChi()).append(", hoc phi:").append(getHocPhi());
        return null;
    }

    @Override
    public void xoa(KeHoachHocTap k) {
        // TODO Auto-generated method stub

    }

}
