public class q_5 {
    public static void test() {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        test();
    }
}
