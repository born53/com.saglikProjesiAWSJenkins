package first.stepdefinitions.api_steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import first.pojo.Patient2;
import first.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

public class patient2Steps {


    Response response;

    @Given("Kullanıcı staff {string} kimliğine sahip hasta verileri için bir alma isteği icin get request gönderir")
    public void kullanıcı_staff_kimliğine_sahip_hasta_verileri_için_bir_alma_isteği_icin_get_request_gönderir
            (String string) {


    }

    @Given("kullanıcı staff durum kodunun {int} olduğunu doğrular")
    public void kullanıcı_staff_durum_kodunun_olduğunu_doğrular(Integer int1) throws JsonProcessingException {

    }
        @Then("kullanıcı, beklenen verilerle hasta bilgilerini doğrular")
        public void kullanıcı_beklenen_verilerle_hasta_bilgilerini_doğrular () {


        }

}



