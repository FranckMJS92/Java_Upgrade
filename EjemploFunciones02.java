public class EjemploFunciones02 {
    public static void main(String[] args) {
        System.out.println(esPrimo(70));
    }

    public static boolean esPrimo(int n) {
        if (n == 2) {
            return true;
        }
        else if(n%2==0){
            return false;
        }
        for (int i = 3; i <Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
