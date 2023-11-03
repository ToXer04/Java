public class Università {
    private Docente[] docenti;

    public Università(Docente[] docenti) {
        this.docenti = docenti;
    }

    public Docente[] getDocenti() {
        return docenti;
    }

    public void setDocenti(Docente[] docenti) {
        this.docenti = docenti;
    }
    public static int minAge(Docente[] docenti) {
        int età = docenti[0].getEtà();
        for(Docente element : docenti) {
            if(età > element.getEtà()) {
                età = element.getEtà();
            }
        }
        return età;
    }
}
