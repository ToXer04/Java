public class Main {
    public static void main(String[] args) {
        String testo = "Questo è un esempio di test";
        int indice = 26;
        System.out.println(stringToUnicode(testo, indice));
    }
    public static StringBuilder stringToUnicode(String testo, int indice) {
        StringBuilder sb = new StringBuilder();
        if(indice < testo.length()) {
            sb.append("\\u").append(Integer.toHexString(testo.charAt(indice)));
        } else {
            sb.append("Error, index out of bounds");
        }
        return sb;
    }
}