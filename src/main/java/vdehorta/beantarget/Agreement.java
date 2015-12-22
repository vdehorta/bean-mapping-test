package vdehorta.beantarget;

import org.joda.time.LocalDate;

import java.util.List;

/**
 * Accords commercial annuel spécifique entre M6 Publicité et un client.
 */
public class Agreement {

    // Fields
    /**
     * Identifiant technique
     */
    private Integer id;

    /**
     * Date de début de la période d'application
     */
    private LocalDate beginDate;

    /**
     * Date de fin de la période d'application
     */
    private LocalDate endDate;

    /**
     * Annonceur concerné par l'accord
     */
    private List<Customer> advertisers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Customer> getAdvertisers() {
        return advertisers;
    }

    public void setAdvertisers(List<Customer> advertisers) {
        this.advertisers = advertisers;
    }
}
