public class Main {
    public static void main(String[] args) {
        int int1 = 2;
        int int2 = 3;
        sumOfTwoInts(int1, int2);

        char char1 = 'ì';
        printChar(char1);

        Integer integer1 = 2;
        Integer integer2 = 3;
        sumOfTwoIntegers(integer1, integer2);

        Character chararacter1 = 'ì';
        printCharacter(chararacter1);

        int int3 = 10;
        double db1 = 10.10;
        char char2 = 'a';
        Integer integer3 = int3;
        Double double1 = db1;
        Character character2 = char2;
        sumOfTwoIntegers(integer3, (int) Math.round(double1));
        printCharacter(character2);


        Integer integer4 = 10;
        Double double2 = 10.10;
        Character character3 = 'a';
        int int4 = integer4;
        double db2 = double2;
        char char3 = character3;
        sumOfTwoInts(int4, (int) Math.round(db2));
        printChar(char3);
    }
    public static void sumOfTwoInts(int int1, int int2) {
        System.out.println(int1 + int2);
    }
    public static void printChar(char char1) {
        System.out.println(char1);
    }
    public static void sumOfTwoIntegers(Integer integer1, Integer integer2) {
        System.out.println(integer1 + integer2);
    }
    public static void printCharacter(Character character1) {
        System.out.println(character1);
    }
}