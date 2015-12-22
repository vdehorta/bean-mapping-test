package vdehorta.beantarget;

/**
 * Regroupement de support. Certaines règles sont applicables à un ensemble de chaine.
 * Par exemple, on regroupe toutes les chaines numériques.
 */
public class SupportGroup {

    /**
     * identifiant technique
     */
    private String code;

    /**
     * Libellé du groupe de supports
     */
    private String name;

    /**
     * Libellé du groupe de supports
     */
    private Integer rank;

    /**
     * Nom de l'image associé au Groupe de Support
     **/
    private String imageName = "gfgfgf";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
