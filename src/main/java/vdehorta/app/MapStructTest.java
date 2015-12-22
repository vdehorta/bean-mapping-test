package vdehorta.app;

import vdehorta.beansource.AgreementPart;
import vdehorta.mapstruct.mapper.SourceTargetMapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by VDehorta on 17/12/2015.
 */
public class MapStructTest {

    public static void main(String[] args) {

        final SourceTargetMapper mapper = Mappers.getMapper(SourceTargetMapper.class);

        long debutChrono = System.currentTimeMillis();

        System.out.println("Début instanciation bean parent AgreementPart");

        final AgreementPart source = new AgreementPart();

        debutChrono = Chrono.chrono(debutChrono, "Fin instanciation bean parent AgreementPart et lancement mapping");

        mapper.map(source); //Mapping using MapStruct

        Chrono.chrono(debutChrono, "Fin mapping !");
    }
}
