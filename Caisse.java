import  java.util.Scanner;
public class Caisse {
    public static void main ( String [] args)
    {
        Scanner Sc = new Scanner (System.in);
        System.out.println("**** Bienvenue a LSLC BANQUE ****");
        Banque Cedric = new Banque();
        int continuer = 1 ; 
        int tentative = 0 ; 
        int n = 0 ;
        Cedric.solde = Integer.parseInt(args[0]);
        while (continuer == 1 )
        {   
            System.out.println("\n");
            System.out.println("1 - Depot d'argent ");
            System.out.println("2 - Retrait d'argent ");
            System.out.println("3 - Consulter compte ");
            System.out.println("4 - Exit ");
            System.out.print(">");
            int choix = Sc.nextInt();
            switch(choix){
                case 1 : 
                System.out.print("Montant > ");
                int montant_depot = Sc.nextInt();
                Cedric.Ajouter(montant_depot);
                System.out.println("Transaction effectue avec success");
                tentative += 1;
                break;
                case 2 : 
                System.out.print("Montant > ");
                int montant_retrait = Sc.nextInt();
                Cedric.retrait(montant_retrait);
                System.out.println("Transaction effectue avec success");
                tentative += 1;
                break;
                case 3 : 
                Cedric.consulter();
                tentative += 1;
                break;
                case 4 : 
                continuer = 0 ;
                break;
                default : 
                System.out.println("Entrez des informations valides ");
                n+=1; }
                if(n>=3)
                {   
                    System.out.println(" Ejection du systeme []-> ");
                    continuer = 0;
                } 
                if (tentative >= 8)
                {   
                    System.out.println("transaction maximale atteinte []-> ");
                    continuer = 0 ;
                }
        }
        Sc.close();
        
        
    }
    
}
