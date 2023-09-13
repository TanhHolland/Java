public class DanhSachDV {
    private boolean isTuoi(String tuoi) {
        String reg = "\\d+";
        if(tuoi.matches(reg)) {
            return true;
        }
        return false;
    }
    private String chuanHoa(String name) {

    }
}
