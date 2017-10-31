package MainController.PobudovaToAnal;

public class Main {
    public static void main(String[] args) {
        x(5);
    }
    static void x(int x){
        double f = x*Math.log(x+1)-1;
        System.out.println(f);
    }
}
