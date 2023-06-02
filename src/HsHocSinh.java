import java.util.ArrayList;

public class HsHocSinh {
    ArrayList<CaNhan> DsCaNhan;

    public HsHocSinh() {
        DsCaNhan = new ArrayList<>();
    }

    public void ThemCaNhan(String hoTen, int tuoi, int namSinh, String queQuan, String lopHoc, String khoaHoc, int kyHoc) {
        CaNhan caNhan = new CaNhan(hoTen, tuoi, namSinh, queQuan, lopHoc, khoaHoc, kyHoc);
        DsCaNhan.add(caNhan);
        System.out.println("thêm thành công");
    }
    public void HienThi(){
        for (int i = 0; i < DsCaNhan.size(); i++){
            DsCaNhan.get(i).HienThiCaNhan();
        }
    }

    public void HienThiHsSinhNam1985() {
        CaNhan caNhan = null;
        for (int i = 0; i < DsCaNhan.size(); i++) {
            if (DsCaNhan.get(i).getNamSinh() == 1985) {
                caNhan = DsCaNhan.get(i);
            }
            if (caNhan == null) {
                System.out.println("không có học sinh sinh năm 1985");
            } else {
                caNhan.HienThiCaNhan();
            }
        }
    }

    public int DemHsSinhNam1985QueThaiNguyen() {
        int count = 0;
        for (int i = 0; i < DsCaNhan.size(); i++) {
            if (DsCaNhan.get(i).getNamSinh() == 1985 && DsCaNhan.get(i).getQueQuan().equals("thainguyen")) {
                count++;
            }
        }
        return count;
    }
}
