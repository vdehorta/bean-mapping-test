package vdehorta.beantarget;

import java.util.Set;

/**
 * Plage d'écrans
 */
public class CommitmentBreaks  {

	//fields
	private Integer id;
	private String beginBreakCode;
	private String endBreakCode;
	private Commitment commitment;
	private Set<CommitmentBreaksDay> days;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBeginBreakCode() {
		return beginBreakCode;
	}

	public void setBeginBreakCode(String beginBreakCode) {
		this.beginBreakCode = beginBreakCode;
	}

	public String getEndBreakCode() {
		return endBreakCode;
	}

	public void setEndBreakCode(String endBreakCode) {
		this.endBreakCode = endBreakCode;
	}

	public Commitment getCommitment() {
		return commitment;
	}

	public void setCommitment(Commitment commitment) {
		this.commitment = commitment;
	}

	public Set<CommitmentBreaksDay> getDays() {
		return days;
	}

	public void setDays(Set<CommitmentBreaksDay> days) {
		this.days = days;
	}
}
