// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Beginnings {

    static String[] names = {"Ola", "Maurycy", "Nikodem", "Gucio", "Lukasz"};

    public static void test() {
        System.out.println("Inside of method test");
    }

    public static void main(String[] args) {

        System.out.println("Hello world");

        test();

        System.out.println("Size of array names: " + names.length);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // Prints empty line
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }
}