package first.baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrl {

    protected RequestSpecification specMedunna;


    @Before
    public void setUp(){

        specMedunna = new RequestSpecBuilder().setBaseUri("https://medunna.com/api").build();

    }


}
