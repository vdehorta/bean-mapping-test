package vdehorta.beansource;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.joda.time.DateTime;

import java.util.*;

/**
 * Version de simulation ayant ses propres engagements et son propre cycle de vie
 */
public class AgreementPartVersion {

    // fields
    /** Identifiant technique */
    private Integer id = 65566;

    /** Simulation 'chapeau' */
    private AgreementPart agreementPart = new AgreementPart();

    /** Numéro de version, commence à 1 */
    private Integer version = 1;

    /** Date de dernière modification */
    private DateTime lastModifiedDate = new DateTime();

    /** Date de création */
    private DateTime creationDate = new DateTime();

    /** Le statut associé a la version => par defaut brouillon */
    private ApvStatus status = new ApvStatus();

    /** Engagements */
    private Set<Commitment> commitments = Sets.newHashSet(new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment(), new Commitment());

    /** Représentation du complément d'information d'une simulation */
    private ComplementVersion complementVersion = new ComplementVersion();

	/** Avis DG + son commentaire */
	private AgreementPartVersionView viewDG = new AgreementPartVersionView();

    /** Avis ADV + son commentaire */
    private AgreementPartVersionView viewADV = new AgreementPartVersionView();

    /** Avis planning + son commentaire */
    private AgreementPartVersionView viewPlanning = new AgreementPartVersionView();

    /** Acquittement effectué par le planning (remis à zero lors de la modification du suivi actif). */
    private boolean ackPlanning = true;

    /** Acquittement effectué par l'ADV (remis à zero lors de la modification du suivi actif). */
    private boolean ackAdv = false;

    /** Gestion du suivi actif */
    private Boolean activeMonitoring = true;

    /** Date de dernière modification du suivi */
    private DateTime monitoringModifiedDate = new DateTime();

    /** Autres Avantages applicables sur la CGV courante */
    private Map<Support, List<OtherAdvantage>> applicableAdvantages = buildApplicableAdvantages();

    private Map<Support, List<OtherAdvantage>> buildApplicableAdvantages() {
        Map<Support, List<OtherAdvantage>> map = Maps.newHashMap();

        for (int i = 0; i < 100; i++) {
            applicableAdvantages.put(new Support(), Lists.newArrayList(new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage(), new OtherAdvantage()));
        }
        return map;
    }

    private Boolean finalisationSupprimee = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AgreementPart getAgreementPart() {
        return agreementPart;
    }

    public void setAgreementPart(AgreementPart agreementPart) {
        this.agreementPart = agreementPart;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public DateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(DateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    public ApvStatus getStatus() {
        return status;
    }

    public void setStatus(ApvStatus status) {
        this.status = status;
    }

    public Set<Commitment> getCommitments() {
        return commitments;
    }

    public void setCommitments(Set<Commitment> commitments) {
        this.commitments = commitments;
    }

    public ComplementVersion getComplementVersion() {
        return complementVersion;
    }

    public void setComplementVersion(ComplementVersion complementVersion) {
        this.complementVersion = complementVersion;
    }

    public AgreementPartVersionView getViewDG() {
        return viewDG;
    }

    public void setViewDG(AgreementPartVersionView viewDG) {
        this.viewDG = viewDG;
    }

    public AgreementPartVersionView getViewADV() {
        return viewADV;
    }

    public void setViewADV(AgreementPartVersionView viewADV) {
        this.viewADV = viewADV;
    }

    public AgreementPartVersionView getViewPlanning() {
        return viewPlanning;
    }

    public void setViewPlanning(AgreementPartVersionView viewPlanning) {
        this.viewPlanning = viewPlanning;
    }

    public boolean isAckPlanning() {
        return ackPlanning;
    }

    public void setAckPlanning(boolean ackPlanning) {
        this.ackPlanning = ackPlanning;
    }

    public boolean isAckAdv() {
        return ackAdv;
    }

    public void setAckAdv(boolean ackAdv) {
        this.ackAdv = ackAdv;
    }

    public Boolean getActiveMonitoring() {
        return activeMonitoring;
    }

    public void setActiveMonitoring(Boolean activeMonitoring) {
        this.activeMonitoring = activeMonitoring;
    }

    public DateTime getMonitoringModifiedDate() {
        return monitoringModifiedDate;
    }

    public void setMonitoringModifiedDate(DateTime monitoringModifiedDate) {
        this.monitoringModifiedDate = monitoringModifiedDate;
    }

    public Map<Support, List<OtherAdvantage>> getApplicableAdvantages() {
        return applicableAdvantages;
    }

    public void setApplicableAdvantages(Map<Support, List<OtherAdvantage>> applicableAdvantages) {
        this.applicableAdvantages = applicableAdvantages;
    }

    public Boolean getFinalisationSupprimee() {
        return finalisationSupprimee;
    }

    public void setFinalisationSupprimee(Boolean finalisationSupprimee) {
        this.finalisationSupprimee = finalisationSupprimee;
    }
}
