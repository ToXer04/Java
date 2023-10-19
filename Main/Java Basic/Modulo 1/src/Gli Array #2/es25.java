public class es25 {
    public static void main(String[] args) {
        arraySearch();
    }
    public static void arraySearch() {
        char[] arr = {'a', 'b', 'c', 'a', 'x', 'a'};
        int counter = 0;
        for(char charX: arr) {
            if(charX=='a') {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}