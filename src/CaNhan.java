public class CaNhan extends HocSinh{
    private String HoTen;
    private int Tuoi;
    private int NamSinh;
    private String QueQuan;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }
    public CaNhan(String hoTen, int tuoi, int namSinh, String queQuan, String lopHoc, String khoaHoc, int kyHoc){
        setHoTen(hoTen);
        setTuoi(tuoi);
        setNamSinh(namSinh);
        setQueQuan(queQuan);
        setLopHoc(lopHoc);
        setKhoaHoc(khoaHoc);
        setKyHoc(kyHoc);
    }
    public void HienThiCaNhan(){
        System.out.println("họ tên: "+getHoTen());
        System.out.println("tuổi: "+getTuoi());
        System.out.println("năm sinh: "+getNamSinh());
        System.out.println("quê quán: "+getQueQuan());
        System.out.println("lớp học: "+getLopHoc());
        System.out.println("khoá học: "+getKhoaHoc());
        System.out.println("kỳ học: "+getKyHoc());
    }
}
