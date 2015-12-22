package vdehorta.beantarget;

/**
 * Avantage n'impactant pas les calculs définit au niveau d'une CGV
 */
public class OtherAdvantage {

    /**
     * Identifiant Technique
     */
    protected Integer id;

    /**
     * Définit si l'avantage est ajouté par défaut lors de la création du premier engagement de la simulation
     */
    protected boolean defaultScheme;

    /**
     * Définit si les podiums sont editables ou non
     */
    protected boolean editable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isDefaultScheme() {
        return defaultScheme;
    }

    public void setDefaultScheme(boolean defaultScheme) {
        this.defaultScheme = defaultScheme;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
