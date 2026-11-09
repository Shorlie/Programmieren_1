package Block_5;

public class TestToString {
    private String a;
    public static void main(String[] args) {
        TestToString c = new TestToString("Hallo");
        System.out.println(c);
    }
    TestToString(String b) {
        this.a = b;
    }

    public String beString(){
        return this.a;
    }
}
