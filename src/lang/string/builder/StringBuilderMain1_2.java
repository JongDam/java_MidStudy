package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        //StringBuilder는 가변 String으로서 메모리 사용량을 고려해 String을 효율적으로 사용하도록 만약 가변적인게 끝났으면 다시 불변String로 바꾸는게 좋음
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("String = " + string);
        }

}
