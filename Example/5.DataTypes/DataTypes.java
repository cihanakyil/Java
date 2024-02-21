public class DataTypes{

    public static void main(String[] args){

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        System.out.println("int myNum = " + myNum);
        System.out.println("float myFloatNum = " + myFloatNum);
        System.out.println("char myLetter = " + myLetter);
        System.out.println("boolean myBool = " + myBool);
        System.out.println("String myText = " + myText);


        /*  
            Primitive Data Types : 
            byte	1 byte	    Stores whole numbers from -128 to 127
            short	2 bytes	    Stores whole numbers from -32,768 to 32,767
            int	    4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long	8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double	8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
            boolean	1 bit	    Stores true or false values
            char	2 bytes 	Stores a single character/letter or ASCII values
        */

        byte myByte = 100;
        short myShort = 5000;
        int myInt = 100000;
        long myLong = 15000000000L;
        float myFloat = 5.75f;
        double myDouble = 19.99d;
        float f1 = 35e3f;
        double d1 = 12E4d;
        boolean boolTrue = true;
        boolean boolFalse = false;

        char myGrade = 'B';
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        String greeting = "Hello World";

        System.out.println("byte myByte = " + myByte);
        System.out.println("short myShort = " + myShort);
        System.out.println("int myInt = " + myInt);
        System.out.println("long myLong = " + myLong);
        System.out.println("float myFloat = " + myFloat);
        System.out.println("double myDouble = " + myDouble);
        System.out.println("float f1 = " + f1);
        System.out.println("double d1 = " + d1);
        System.out.println("boolean boolTrue = " + boolTrue);
        System.out.println("boolean boolFalse = " + boolFalse);
        System.out.println("char myGrade = " + myGrade);
        System.out.println("char myVar1 = " + myVar1);
        System.out.println("char myVar2 = " + myVar2);
        System.out.println("char myVar3 = " + myVar3);
        System.out.println("String greeting = " + greeting);



        /*
                    İlkel Olmayan Veri Türleri
            İlkel olmayan veri türlerine nesnelere atıfta bulundukları için referans türleri denir .

            İlkel ve ilkel olmayan veri türleri arasındaki temel fark şunlardır:

            İlkel türler Java'da önceden tanımlanmıştır (zaten tanımlanmıştır). İlkel olmayan türler programcı tarafından oluşturulur ve Java tarafından tanımlanmaz ( hariç String).
            İlkel olmayan türler, belirli işlemleri gerçekleştirecek yöntemleri çağırmak için kullanılabilirken, ilkel türler bunu yapamaz.
            İlkel bir türün her zaman bir değeri vardır, ilkel olmayan türler ise null.
            İlkel türler küçük harfle başlarken, ilkel olmayan türler büyük harfle başlar.
            İlkel olmayan türlere örnek olarak Strings , Arrays , Classes, Interface vb. gösterilebilir.
         */
        
    }   

}