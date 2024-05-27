package Test;

class study2 {int x;}
class test2{
    public static void main(String[] args) {
        study2 s = new study2();
        s.x = 10;
        System.out.println("main( ) : x = " + s.x);

        change(s);
        System.out.println("After change(s)");
        System.out.println("main():x="+s.x);
    }

static void change(study2 s){
    s.x = 1000;
    System.out.println("change() : x = " + s.x);
    }
}
