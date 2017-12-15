/*
package MainController.ShiselniMetodi;


public class Eiler {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double h = 0.1;

        double n = (b - a) / h;
        double X[] = new double[(int) n];
        double Y1[] = new double[(int) n];
        double Y[] = new double[(int) n];
        X[0]=a;
        Y[0]=2;
        for(int i=1; i<=n-1; i++){
            X[i]=a+i*h;
            Y1[i]=Y[i-1]+h*f(X[i-1],Y[i-1]);
            Y[i]=Y[i-1]+h*(f(X[i-1],Y[i-1])+f(X[i],Y1[i]))/2.0;
        }
        for(int i=0; i<=n; i++){
            cout << "X["<<i<<"]="<<X[i] <<" ";
            System.out.println();
        }
        cout << endl;
        for(int i=0; i<=n; i++){

        }
    }


  static   double f(double x, double y) {
        return 3 * Math.sin(2 * y) + x;
    }
}
*/
