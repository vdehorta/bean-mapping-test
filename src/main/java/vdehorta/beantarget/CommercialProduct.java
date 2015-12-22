package vdehorta.beantarget;

import org.joda.time.LocalDate;

/**
 * Produit commercial.
 * 
 * @author OJORDAN
 */
public class CommercialProduct {

    private Integer id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
