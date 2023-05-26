package prakt1;


//Имплементировать интерфейс Function, получающий на вход пару
//чисел и возвращающий наибольший общий делитель.

interface Function<T,R>{
    void GCD (T a, R b);
}

public class Main {
    public static void main(String[] args){
        int y = 10;
        Function<Integer, Integer> delitel = (a,b) -> {
            int gcd = 1;
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        };
        delitel.GCD(10, 15);
    }
};
