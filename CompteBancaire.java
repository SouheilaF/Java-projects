/** Classe CompteBancaire **/


public class CompteBancaire {
	private String nom;
	private String numero;
	private float solde;

   /** Constructeurs **/

	public CompteBancaire(String nomC, String noC, float depot) {
		this.nom = nomC;
		this.numero = noC;
		this.solde = depot;
	}

	public CompteBancaire(String nomC, String noC) {
		this.nom = nomC;
		this.numero = noC;
		this.solde = 0f;
	}
	
	public float vider() {
		float montant = this.solde;
		this.solde = 0;
		return montant;
	}

	public void afficher() {
		System.out.println("proprio: "+this.nom+"numéro : "+this.numero+" solde : "+this.solde);
	}

	/** Getters **/

	public String getNom () {
		return this.nom;		
	}
	public String getNumero () {
		return this.numero;
	}
	public float getSolde() {
		return this.solde;
	}

	/** Setters **/
	public void setNom(String nouvNom) {

	}
	public void setSolde(float nouvSolde) {
	}

	/** Méthode toString **/

	public String toString() {
		return "proprio :"+this.nom+", numéro : "+this.numero +", solde:"+this.solde;
	}

   /** retourne la conversion du solde du compte dans une monnaie dont le taux de change est passé en paramètre **/

  	public boolean propri(CompteBancaire compte) {
		if (this.nom.equals(compte.getNom()))
			return true; 
		return false;
	}

	
	public void modifiersolde(float somme) {
		if (this.solde+somme > 0) {
			this.solde = this.solde+somme;
		}
		
	}

	public boolean transfer(CompteBancaire compte, float somme) {
		if (this.propri(compte)) {
			if (somme < compte.solde) {
				
				compte.modifiersolde(-somme)	
			}
		}
		return false;
	}
}
