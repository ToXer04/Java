public class es25 {
    public static void main(String[] args) {
        arraySearch();
    }
    public static void arraySearch() {
        char[] arr = {'a', 'b', 'c', 'a', 'x', 'a'};
        boolean areThereA = false;
        for(char charX: arr) {
            if(charX=='a') {
                System.out.println(charX);
                areThereA = true;
            }
        }
        if(!areThereA) {
            System.out.println(0);
        }
    }
}