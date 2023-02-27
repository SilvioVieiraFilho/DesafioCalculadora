import org.example.ItemsCalculadora;
import org.example.Menu;
import org.junit.jupiter.api.Test;
import pl.pojo.tester.api.assertion.Method;

import static pl.pojo.tester.api.FieldPredicate.includeAllFields;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

public class TesteClassePrincipal {


    @Test


    public void testeGetterSetterConstructor() {
        var sut =  Menu.class;
        assertPojoMethodsFor(sut, includeAllFields(sut))
                .testing(Method.CONSTRUCTOR, Method.SETTER, Method.GETTER)
                .areWellImplemented();


    }


}

