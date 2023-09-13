public class Sinhvien {
    private String id;
    private String name;
    private String tuoi;

    public Sinhvien(String id, String name, int tuoi) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
