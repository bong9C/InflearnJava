package Test;

public class study5 {
    public static void main(String[] args) {

        int[] age = new int[40];

        // int 자료형 배열을 선언과 동시에 { 17, 25, 29 }를 대입 하려고 합니다. 기본형과 단축형으로 만들어 주세요

        int[] a = new int[3];
        a[0] = 17;
        a[1] = 25;
        a[2] = 29;

        for (int i=0; i < 3 ; ++i) {
            System.out.println(a[i]);
        }

    }
}
