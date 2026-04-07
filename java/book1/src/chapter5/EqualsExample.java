package chapter5;

public class EqualsExample {
    // 문자열 리터럴로 생성하느냐 new 연산자로 생성하느냐에 따라 비교 연산자 결과가 달라짐
    public static void main(String[] args) {
        String strVal1 = "홍길동";
        String strVal2 = "홍길동";

        if(strVal1 == strVal2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVal1.equals(strVal2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
