import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat;
import io.dropwizard.jackson.Jackson;
import io.dropwizard.micro.Person;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializesToJSON() throws Exception {
        final Person person = new Person("Luther Blissett", "lb@example.com");

        final String expected = MAPPER.writeValueAsString(
                MAPPER.readValue(fixture("fixtures/person.json"), Person.class));
        
        assertThat(MAPPER.writeValueAsString(person)).isEqualTo(expected);
    }
    
    @Test
    public void deserializesFromJSON() throws Exception {
        final Person person = new Person("Luther Blissett", "lb@example.com");
        final Person expected = MAPPER.readValue(fixture("fixtures/person.json"), Person.class);

        assertThat(expected.getName()).isEqualTo(person.getName());
        assertThat(expected.getEmail()).isEqualTo(person.getEmail());
    }
}
