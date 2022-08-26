package first.stepdefinitions.DBStepDefinitions;
/*

import first.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class US_010DoktorRandevuDB {

    List< Object > actualAppointmentIds;
    List<Object> idList;
    String fileName;

    @Given("Doktor Sinem DB ile baglanti olusturur")
    public void doktor_sinem_db_ile_baglanti_olusturur() {
        DatabaseUtility.createConnection();
    }

    @Given("Doktor Sinem DB'e sorgu gonderir randevu id si ile hasta bilgilerini alir")
    public void doktorSinemDBESorguGonderirRandevuIdSiIleHastaBilgileriniAlir() {
        String query = "select * from appointment";
        System.out.println(DatabaseUtility.getColumnNames(query));
        System.out.println("====id list=====");
        idList = DatabaseUtility.getColumnData(query, "id");
        System.out.println(idList);
        fileName = "src/test/resources/testData/AppointmentIDs.txt";
        WriteToTxt.saveAppointmentIDs(fileName, idList);
    }

    @Then("Doktor Sinem bilgileri dogrular ve kaydeder")
    public void doktorSinemBilgileriDogrularVeKaydeder() {

        //id dogrulama
        actualAppointmentIds = ReadTxt.returnAppointmentIDsList(fileName);
        List<Object> expectedAppointmentIds=new ArrayList<>();
        expectedAppointmentIds.add(157538);
        Assert.assertTrue("ID'ler uyusmuyor",actualAppointmentIds.containsAll(expectedAppointmentIds));

    }

}*/
