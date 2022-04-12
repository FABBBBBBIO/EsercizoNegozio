public class NonAlimentare extends Prodotto{
    protected String materialePrincipale;
    protected boolean riciclabile;
    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo Prodotto NonAlimentare
     * @param materialePrincipale Nome del materiale principale
     * @param riciclabile True se riciclabile, False altrimenti
     * @param nome  nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza nazione di produzione del nuovo oggetto Prodotto
     */
    public NonAlimentare(String materialePrincipale,boolean riciclabile,String nome,double prezzo,String provenienza){
        super(nome, prezzo, provenienza);
        this.materialePrincipale=materialePrincipale;
        this.riciclabile=riciclabile;
    }
    /**
     * Restituisce il nome del materiale principale
     * @return nome del materiale principale
     */
    public String getMaterialePrincipale(){
        return this.materialePrincipale;
    }
    /**
     * Restituisce se il prodotto Non Alimnetare è riciclabile oppure no
     * @return  true se è riciclabile, falso altrimenti
     */
    public boolean isRiciclabile(){
    return this.riciclabile;
    }
    /**
     * Imposta il materiale dell'oggetto
     * @param materialePrincipale - stringa che rappresenta materiale
     */
    public void setMaterialePrincipale(String materialePrincipale){
        this.materialePrincipale=materialePrincipale;
    }
    /**
     * Imposta vero se l'oggetto è riciclabile, falso altrimenti
     * @param riciclabile - vero/falso
     */
    public void setRiciclabile(boolean riciclabile){
        this.riciclabile=riciclabile;
    }
    /**
     * Applica uno sconto sul prodotto Non Alimentare.
     */
    public void applicaSconto(){
        if(riciclabile==true){
            prezzo=prezzo-((prezzo/100)*15);
        }
        prezzo=prezzo-((prezzo/100)*10);
    }
}
