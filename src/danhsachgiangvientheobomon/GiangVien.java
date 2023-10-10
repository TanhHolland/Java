package danhsachgiangvientheobomon;

public class GiangVien{
    private String ma,name,lop,ten;

    public GiangVien(int ma,String name, String lop) {
        this.ma = "GV" + String.format("%02d",ma);
        String[] dd = name.split("\\s+");
        ten = dd[dd.length-1];
        this.name = name;
        String[] d = lop.split("\\s+");
        String result = "";
        for(int i = 0; i<d.length; i++)
            result += String.valueOf(d[i].charAt(0)).toUpperCase();
        this.lop = result;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return ma +" " + name + " " + lop;
    }
}
