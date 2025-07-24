package modules.workflowTestbed.DocumentTwo;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

public class DocumentTwoServiceTest {

    @Inject
    private DocumentTwoService service = new DocumentTwoService();

    @Test
    public void testPlunderTheBooty() {

        assertThat(service.plunderTheBooty(), notNullValue());
    }

    @Test
    public void testDoAThingReturnsNotNull() {
        assertThat(service.doAThing(), notNullValue());
    }

}
