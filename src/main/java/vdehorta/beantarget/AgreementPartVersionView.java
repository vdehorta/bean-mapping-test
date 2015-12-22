package vdehorta.beantarget;

/**
 * Validation de la faisabilité d'une simulation
 */
public class AgreementPartVersionView {

	private Boolean status;
	
	private String comment;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
