public class Banque {
    
    public int solde = 0 ;

    public void Ajouter( int montant)
    {
        this.solde += montant;
    }
    public void retrait (int montant)
    {
        this.solde -= montant;
    }

    public void consulter()
    {
        System.out.println("Votre Solde s'eleve a : "+solde+"Francs CFA ");
    }

}
