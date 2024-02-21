public class TypeCasting{

    public static void main(String[] args){

        /*
         * Widening Casting (automatically) - converting a smaller type to a larger type size:
                byte -> short -> char -> int -> long -> float -> double
        
          Narrowing Casting (manually) - converting a larger type to a smaller size type:
                double -> float -> long -> int -> char -> short -> byte
        */


        // Widening Casting :
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0


        // Narrowing Casting : 
        double myDouble_2 = 9.78d;
        int myInt_2 = (int) myDouble_2; // Manual casting: double to int
    
        System.out.println(myDouble_2);   // Outputs 9.78
        System.out.println(myInt_2);      // Outputs 9
    }
}