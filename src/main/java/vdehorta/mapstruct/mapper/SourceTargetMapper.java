package vdehorta.mapstruct.mapper;

import vdehorta.beantarget.*;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by VDehorta on 21/12/2015.
 */
@Mapper
public interface SourceTargetMapper {

    Agreement map(vdehorta.beansource.Agreement source);

    AgreementPart map(vdehorta.beansource.AgreementPart source);

    AgreementPartVersion map(vdehorta.beansource.AgreementPartVersion source);

    AgreementPartVersionView map(vdehorta.beansource.AgreementPartVersionView source);

    Amount map(vdehorta.beansource.Amount source);

    ApvStatus map(vdehorta.beansource.ApvStatus source);

    CampaignHeader map(vdehorta.beansource.CampaignHeader source);

    CommercialProduct map(vdehorta.beansource.CommercialProduct source);

    Commitment map(vdehorta.beansource.Commitment source);

    CommitmentBreaks map(vdehorta.beansource.CommitmentBreaks source);

    CommitmentBreaksDay map(vdehorta.beansource.CommitmentBreaksDay source);

    CommitmentSigma map(vdehorta.beansource.CommitmentSigma source);

    ComplementVersion map(vdehorta.beansource.ComplementVersion source);

    Customer map(vdehorta.beansource.Customer source);

    DiscountAdvantage map(vdehorta.beansource.DiscountAdvantage source);

    Family map(vdehorta.beansource.Family source);

    OtherAdvantage map(vdehorta.beansource.OtherAdvantage source);

    OtherAdvantageValue map(vdehorta.beansource.OtherAdvantageValue source);

    PricingLevelType map(vdehorta.beansource.PricingLevelType source);

    Product map(vdehorta.beansource.Product source);

    SalesMode map(vdehorta.beansource.SalesMode source);

    Support map(vdehorta.beansource.Support source);

    SupportGroup map(vdehorta.beansource.SupportGroup source);

    SupportInvestment map(vdehorta.beansource.SupportInvestment source);

    User map(vdehorta.beansource.User source);

    List<OtherAdvantage> mapOtherAdvantages(List<vdehorta.beansource.OtherAdvantage> value);

    Map<Support, List<OtherAdvantage>> mapSupportOtherAdvantagesMap(Map<vdehorta.beansource.Support, List<vdehorta.beansource.OtherAdvantage>> value);

    Set<Support> mapSupports(Set<vdehorta.beansource.Support> value);

    Map<Integer, Set<Support>> mapIntegerSupportsMap(Map<Integer, Set<vdehorta.beansource.Support>> value);

}
