import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomi[] = new String[10];
        int n;
        String nome;
        String cancellaNome;
        String ricercaNome;
        do {
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
            n = input.nextInt();
            nome= input.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Inserisci un nome");
                    nome = input.nextLine();
                    aggiuntaNome(nome);
                    break;
                case 2:
                    System.out.println("Inserisci il nome da cancellare");
                    cancellaNome= input.nextLine();
                    cancellazioneNome(cancellaNome);
                    break;
                case 3:
                    System.out.println("Inserisci un nome da ricercare");
                    ricercaNome= input.nextLine();
                    ricercaNome(ricercaNome);
                    break;
            }
        }while(n!=0);
    }
    private static String[] aggiuntaNome (String nomi){
        String nomi2[]=new String[10];
        nomi2[0]=nomi;
        return nomi2;
    }
    private static String[] cancellazioneNome (String cancellaNome){
        String nomi3[]=new String[10];
        for (int i=0;i<nomi3.length;i++){
            if (nomi3[i].equals(cancellaNome)){
                nomi3[i]="";
            }
        }
        return nomi3;
    }
    private static boolean ricercaNome (String ricercaNome){
        int conta=0;
        boolean isPresente=false;
     String nomi4[]=new String[10];
     for (int i=0;i< nomi4.length;i++){
         if (nomi4[i].equals(ricercaNome)){
             conta++;
         }
     }
     if (conta>=1){
         isPresente=true;
     }
     else{
         isPresente=false;
     }
     return isPresente;
    }
}