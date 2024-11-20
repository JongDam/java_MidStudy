package enumertaion.ex2;

public class ClassGrade {// 타입 안정 열거형 패턴
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private로 생성 막기
    private ClassGrade(){}

}
