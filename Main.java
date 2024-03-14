import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String nomi[]=new String[10];
        int n;
        String nome;
        System.out.println("Scegli tra");
        System.out.println("1 - Aggiunta di un nome");
        System.out.println("2 - Cancellazione del singolo nome");
        System.out.println("3 - Ricerca sequenziale di un nome");
        System.out.println("4 - Visualizza nomi ripetuti con numero ripetizioni");
        System.out.println("5 - Modifica di un nome");
        System.out.println("6 - Visualizzazione di tutti i nomi presenti");
        System.out.println("7 - Ricerca del nome più lungo e più corto");
        System.out.println("8 - Cancellazione di tutte le occorrenze di un nome");
        System.out.println("0 - Uscita");
        n= input.nextInt();
        switch (n){
            case 1:
                System.out.println("Inserisci un nome");
                nome=input.nextLine();
                break;
        }
    }
    private static String[] aggiuntaNome (String nome){
        String nomi[]=new String[10];
        nomi[0]=nome;
        return nomi;
    }

}