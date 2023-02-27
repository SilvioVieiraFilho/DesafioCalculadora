import org.example.CalculoImc;
import org.example.ItemsCalculadora;
import org.example.Menu;
import org.junit.jupiter.api.Test;
import pl.pojo.tester.api.assertion.Method;

import static pl.pojo.tester.api.FieldPredicate.includeAllFields;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

public class TesteItemCalculadora {


    @Test
    public void testeGetterSetterConstructor() {
        var sut = ItemsCalculadora.class;
        assertPojoMethodsFor(sut, includeAllFields(sut))
                .testing(Method.SETTER, Method.GETTER,Method.CONSTRUCTOR)
                .areWellImplemented();

    }
}