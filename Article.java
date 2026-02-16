

public class Article {
	
	
	//** Constantes**//
	
	public final static int CODE_BARRE_MIN = 1;
	public final static int CODE_BARRE_MAX = 9999;
	
	public final static double TVA = 20.6f;
	
	//** Variables d'instances **//
	
	private int codeBarre;
	private String nomArticle;
	private double prixHT;
	
	
	//** Constructeurs **//
	
	public Article () {
	this.codeBarre = 0;
	this.nomArticle = "None";
	this.prixHT = 0;
	}
	
	public Article (int codeBarre, String nomArticle, double prixHT) {
		this.codeBarre = codeBarre;
		this.nomArticle = nomArticle;
		this.prixHT = prixHT;
	}

	public Article (Article a) {
		this.codeBarre = a.getcodeBarre();
		this.nomArticle = a.getnomArticle();
		this.prixHT = a.getprixHT();
	}
	
	//** Getters **//
	public int getcodeBarre() {
		return this.codeBarre;
	}
	
	public String getnomArticle() {
		return this.nomArticle;
	}
	
	public double getprixHT() {
		return this.prixHT;
	}
	
	//** Setters **//
	
	public void setcodeBarre(int newCodeBarre) {
	
		if (this.codeBarre >= Article.CODE_BARRE_MIN &&
		codeBarre <= Article.CODE_BARRE_MAX) {
			this.codeBarre = newCodeBarre;
		}
	
		else { System.out.println("ERREUR DE CODE BARRE!" ); }
	}
	
	public void setnomArticle(String newNomArticle) {
		this.nomArticle = newNomArticle;
	}
	
	public void setprixHT(int newPrixHT) {
		if (newPrixHT < 0) {
			System.out.println( "ERREUR DE PRIX! Ne peut pas être négatif."); }
		this.prixHT = newPrixHT;
	}
	
	
	
	//** Méthodes **//
	
	public double prixTTC() {
		return (this.prixHT * (1 + Article.TVA / 100));
	}
	
		
	//** ToString **//
	
	public String toString() {
		return ("L'article appelé ["+ this.nomArticle +
		"] a une référence de [" + this.codeBarre +
		"] et coûte " + this.prixHT);
	}
	
	

	
	

}
