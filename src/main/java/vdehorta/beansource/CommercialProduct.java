package vdehorta.beansource;

import org.joda.time.LocalDate;

/**
 * Produit commercial.
 * 
 * @author OJORDAN
 */
public class CommercialProduct {

    private Integer id = 45;

    private String name = "gfgfgff";

    private LocalDate startDate = new LocalDate();

    private LocalDate endDate = new LocalDate();

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
