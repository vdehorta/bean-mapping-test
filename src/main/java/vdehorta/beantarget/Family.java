package vdehorta.beantarget;

/**
 * Famille de produit : Regroupement de code variétés servant de base pour le calcul de remise volume.
 * 
 * Il existe 3 familles dans la nomenclature des produits TV : Famille 1 en rose, Famille 2 en bleu 
 * et Famille 3 en vert.
 */
public class Family {

	private String code;

	private String name;

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
}
