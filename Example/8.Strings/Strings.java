public class Strings{

    public static void main(String[] args) {
        
        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("txt Stringinin Uzunluğu : " + txt.length()); 
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        String txt_2 = "Please locate where 'locate' occurs!";
        System.out.println(txt_2.indexOf("locate")); // Outputs 7

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String isim = "CIHAN";
        String soyisim = "AKYIL";
        System.out.println(firstName.concat(lastName));

        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println("x : "+ x + "y : " + y + "z: " + z);

        

        String t = "10";
        String u = "20";
        String v = t + u;  // z will be 1020 (a String)
        System.out.println("t : "+ t + "u : " + u + "v: " + v);

        String a = "10";
        int b = 20;
        String c = a + b;  // z will be 1020 (a String)
        System.out.println("a : "+ a + "b : " + b + "c: " + c);


        String txt_3 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt_3);

        String txt_4 = "It\'s alright.";
        System.out.println(txt_4);

        String txt_5 = "The character \\ is called backslash.";
        System.out.println(txt_5);

        String txt_6 = "Hello\nWorld!";
        System.out.println(txt_6);

        String txt_7 = "Hello\rWorld!";
        System.out.println(txt_7);

        String txt_8 = "Hello\tWorld!";
        System.out.println(txt_8);

        String txt_9 = "Hel\blo World!";
        System.out.println(txt_9);


    }

}