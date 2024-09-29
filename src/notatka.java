public class notatka {
    private static int licznikNotatek;

    private  int idNotatek;

    private  String tytulNotatki;

    private String trescNotatki;


    public notatka(String trescNotatki, String tytulNotatki) {
        this.trescNotatki = trescNotatki;
        this.tytulNotatki = tytulNotatki;
        licznikNotatek++;

        idNotatek = licznikNotatek;
    }

    public  void wyswietlNotatke(){
        if (tytulNotatki == ""){
            System.out.println("brak tytulu");
        }else {
            System.out.println(tytulNotatki);
        }

        if (trescNotatki == ""){
            System.out.println("brak tresci");
        }else {
            System.out.println(trescNotatki);
        }
    }

    public void wyswietlWszystko(){
        System.out.println("wszystkie notatki" + "\n" + tytulNotatki + "\n" + idNotatek + "\n" + trescNotatki);
    }
}
