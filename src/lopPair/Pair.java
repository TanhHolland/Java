package lopPair;

public class Pair <K,V> {// K,V để có thể thay đổi kiểu dữ liệu linh hoạt nếu cần
    private K key;
    private V value;
    static boolean checkSNT(int n) {
        if (n < 2 ) return false;
        for(int i = 2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public boolean isPrime() {
        if(checkSNT((Integer) key) && checkSNT((Integer) value)) return true;
        return false;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
