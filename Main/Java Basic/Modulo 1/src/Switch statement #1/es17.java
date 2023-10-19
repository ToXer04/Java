public class es17 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(checkDay(num));
    }
    public static String checkDay(int num) {
        switch (num) {
            case 1: {
                return "Monday";
            }
            case 2: {
                return "Tuesday";
            }
            case 3: {
                return "Wednesday";
            }
            case 4: {
                return "Thursday";
            }
            case 5: {
                return "Friday";
            }
            case 6: {
                return "Saturday";
            }
            case 7: {
                return "Sunday";
            }
            default: {
                return "There's an error!";
            }
        }
    }
}