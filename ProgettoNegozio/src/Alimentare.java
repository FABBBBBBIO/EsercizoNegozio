import java.util.Calendar;
public class Alimentare extends Prodotto{
    protected int annoScadenza;
    protected int meseScadenza;
/**
 * Costruttore Parametrico - Costruisce un oggetto di tipo ProdottoAlimentare
 * @param annoScadenza
 * @param meseScadenza
 * @param nome
 * @param prezzo
 * @param provenienza
 */
    public Alimentare(int annoScadenza,int meseScadenza,String nome,double prezzo,String provenienza){
        super(nome, prezzo, provenienza);
        this.annoScadenza=annoScadenza;
        this.meseScadenza=meseScadenza;
        }
    /**
    * Restituisce il mese di scadenza riportato sulla confezione
    * @return
    */
    public int getMeseScadenza(){
        return this.meseScadenza;
    }
    /**
     * Restituisce l'anno di scadenza riportato sulla confezione
     * @return
     */
    public int getannoScadenza(){
        return this.annoScadenza;
    }
    /**
     * Imposta il mese di scadenza dell'oggetto Prodotto Alimentare
     * @param meseScadenza
     */
    public void setMeseScadenza(int meseScadenza){
        this.meseScadenza=meseScadenza;
    }
    /**
     * Imposta l'anno di scadenza dell'oggetto Prodotto Alimentare
     * @param annoScadenza
     */
    public void setAnnoScadenza(int annoScadenza){
        this.annoScadenza=annoScadenza;
    }
    /**
     * Restituisce una stringa che rappresenta l'oggetto ProdottoAlimentare
     */
    public String toString(){
        return "mese di scadenza: "+this.meseScadenza+" anno scadenza: " +this.annoScadenza;
    }
    /**
     * Controlla la scadenza del prodotto
     * @return
     */
    public boolean isScaduto(){
        Calendar cal=Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        if(annoScadenza == year)
        return true;
        else if(annoScadenza == year){
            if(meseScadenza<month){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    /**
     * Applica uno sconto sul prezzo del prodotto Alimentare.
     */
    public void applicaSconto(){
        Calendar cal= Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        if(isScaduto()==false){
            if(meseScadenza == month && annoScadenza == year){
                prezzo=prezzo-((prezzo/100)*50);
            }
            else{
                prezzo=prezzo-((prezzo/100)*10);
            }
        }
    }
}
