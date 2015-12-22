package vdehorta.app;

import vdehorta.beansource.AgreementPart;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 * Created by VDehorta on 17/12/2015.
 */
public class DozerTest {

    public static void main(String[] args) {

        final Mapper mapper = new DozerBeanMapper();

        long debutChrono = System.currentTimeMillis();

        System.out.println("Début instanciation bean parent AgreementPart");

        final AgreementPart source = new AgreementPart();

        debutChrono = Chrono.chrono(debutChrono, "Fin instanciation bean parent AgreementPart et lancement mapping");

        mapper.map(source, vdehorta.beantarget.AgreementPart.class); //Mapping using Dozer

        Chrono.chrono(debutChrono, "Fin mapping !");
    }
}
