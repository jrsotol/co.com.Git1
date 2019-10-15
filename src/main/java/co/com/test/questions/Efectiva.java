package co.com.test.questions;

import co.com.test.userinterface.ReservaEfectivaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Created by Candado on 15/10/2019.
 */
public class Efectiva implements Question<String>{

    private ReservaEfectivaPage reservaEfectivaPage;


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ReservaEfectivaPage.AVISO_HORA_SALIDA).viewedBy(actor).asString();
    }

    public static Efectiva reserva() {
        return new Efectiva();
    }
}

