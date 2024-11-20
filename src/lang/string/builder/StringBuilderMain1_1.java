package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        //StringBuilder는 가변 String으로서 메모리 사용량을 고려해 String을 효율적으로 사용하도록 만약 가변적인게 끝났으면 다시 불변String로 바꾸는게 좋음
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);
        }

}
