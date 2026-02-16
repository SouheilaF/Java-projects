/******************** Test de la classe *****************************/

public class TestCompteBancaire
{

public static void main(String args[]) {

    CompteBancaire t = new CompteBancaire("Tsukasa", "123456F", 1500f);
    CompteBancaire e = new CompteBancaire("Emu", "654321F", 4524f);
    CompteBancaire r = new CompteBancaire("Rui", "564312F", 2025f);


    //    t.propri(CompteBancaire e);
    System.out.println(t.getNom());
    System.out.println(t.propri(e));
    t.modifiersolde(-2000);

    System.out.println(t.getSolde());
    
    System.out.println("End");



} /** fin du main **/
} /** fin de la classe **/


