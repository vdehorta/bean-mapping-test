package vdehorta.beansource;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Support : conteneur d'espace publicitaire. Dans le cadre de la télévision, les supports sont les chaines.
 */
public class Support {

    // Fields
    /**
     * id fonctionnel
     */
    private Integer code = 32154;

    /**
     * nom
     */
    private String name = "ghgbvbv";

    /**
     * visible pour le Directeur Planing
     **/
    private Boolean visibleDP = Boolean.FALSE;

    /**
     * Determine si la création d'un pack sur ce support est autorisée
     */
    private Boolean isAllowedPack = false;

    private Set<Family> families = Sets.newHashSet(new Family(), new Family(), new Family(), new Family(), new Family(), new Family(), new Family(), new Family(), new Family(), new Family());

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVisibleDP() {
        return visibleDP;
    }

    public void setVisibleDP(Boolean visibleDP) {
        this.visibleDP = visibleDP;
    }

    public Boolean getIsAllowedPack() {
        return isAllowedPack;
    }

    public void setIsAllowedPack(Boolean isAllowedPack) {
        this.isAllowedPack = isAllowedPack;
    }

    public Set<Family> getFamilies() {
        return families;
    }

    public void setFamilies(Set<Family> families) {
        this.families = families;
    }
}
