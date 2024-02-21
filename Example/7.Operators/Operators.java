public class Operators{

    public static void main(String[] args){

        System.out.println("ARITHMETIC OPERATORS");
        int x = 5;
        int y = 3;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("x+y : " + (x + y));
        System.out.println("x-y : " + (x - y));
        System.out.println("x*y : " + (x * y));
        System.out.println("x/y : " + (x / y));
        System.out.println("x%y : " + (x % y));

        ++x;
        System.out.println("++x : " + x);
        --x;
        System.out.println("--x : " + x);

        System.out.println("ASSIGNMENT OPERATORS");
        int z = 10;
        System.out.println("int z =  " + z);
        z +=5;
        System.out.println("z += 5  " + z);
        z -=2;
        System.out.println("z -= 2  " + z);
        z *=5;
        System.out.println("z *= 5  " + z);
        z /=5;
        System.out.println("z /= 5  " + z);
        z %=3;
        System.out.println("z %= 3  " + z);
        z &=3;
        System.out.println("z &= 3  " + z);
        z |=3;
        System.out.println("z |= 3  " + z);
        z ^=3;
        System.out.println("z ^= 3  " + z);
        z >>=3;
        System.out.println("z >>= 3  " + z);
        z <<=3;
        System.out.println("z <<= 3  " + z);
        
        System.out.println("COMPARISONS OPERATORS");
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));

        System.out.println("LOGICAL OPERATORS");
        System.out.println("x > 3 && x < 10 : " + (x > 3 && x < 10));
        System.out.println("x > 3 || x < 4 : " + (x > 3 || x < 4));
        System.out.println("!(x > 3 && x < 10 : )" + (!(x > 3 && x < 10))); 



    }
}