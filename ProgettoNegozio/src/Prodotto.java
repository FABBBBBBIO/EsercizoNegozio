/**
 * @author Fabbio
 * la classe prodotto crea degli oggetti di tipo prodotto
 */
public class Prodotto {
    protected String nome;
    protected double prezzo;
    protected String provenienza;
/**
 * Costruttore parametri, costruisce un oggetto Prodotto dato il nome prezzo e nazione di provenienza
 * @param nome - nome da assegnare al nuovo oggetto Prodotto
 * @param prezzo - prezzo da assegnare al nuovo oggetto Prodotto
 * @param provenienza - nazione di produzione del nuovo oggetto Prodotto
 */
    public Prodotto(String nome, double prezzo, String provenienza){
        this.nome=nome;
        this.prezzo=prezzo;
        this.provenienza=provenienza;
    }
    /**
     * Restituisce il nome del prodotto
     * @returnil nome del prodotto
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Restituisce il prezzo del prodotto
     * @return il prezzo del prodotto
     */
    public double getPrezzo(){
        return this.prezzo;
    }
    /**
     * Restituisce la nazione di produzione del prodotto
     * @return nazione di provenienza
     */
    public String getProvenienza(){
        return this.provenienza;
    }
    /**
     * Imposta il nome del prodotto
     * @param nome - nome del prodotto
     */
    public void setNome(String nome){
        this.nome=nome;
    }
    /**
     * Imposta il prezzo dell'oggetto di tipo Prodotto
     * @param prezzo - prezzo del prodotto
     */
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
    /**
     * Imposta la provenienza dell'oggetto di tipo Prodotto
     * @param provenienza - stringa provenienza
     */
    public void setProvenienza(String provenienza){
        this.provenienza=provenienza;
    }
    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Prodotto
     */
    public String toString(){
        return "nome: "+this.nome+" prezzo: "+this.prezzo+" Provenienza: "+this.provenienza;
    }
     /**
     * Applica uno sconto del 10% sul prezzo del prodotto
     */
    public void applicaSconto(){
        prezzo=prezzo-((prezzo/100)*10);
     }
}
