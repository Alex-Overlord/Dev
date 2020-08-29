import java.util.Scanner;

public class Alex {
    
    private int chiffre;
    
    public int getChiffre() { return chiffre; }
    public void setChiffre(int chiffre) { this.chiffre = chiffre; }
    
    public void modif(Scanner s) {
        System.out.println("Saisissez le chiffre");
        s = new Scanner(System.in);
        this.setChiffre(s.nextInt());
        System.out.println(this.getChiffre());
    }

    public static void main(String []args){
        Alex a = new Alex();
        System.out.println(a.getChiffre()); // affiche 0
        
        Scanner sc = new Scanner(System.in);
        a.modif(sc);
    }
}