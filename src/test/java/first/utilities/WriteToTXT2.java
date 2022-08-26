package first.utilities;

import first.pojo.Appointments;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToTXT2 {


    public static void saveAppointmentsData(Appointments[] appointments){
        try{
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("appointments_data"), false);//burasi bizim icin dosya olusturur
            BufferedWriter bw = new BufferedWriter(fileWriter);//burasida dosyanin icine yazdirir
            for (int i = 0; i < appointments.length; i++) {
                bw.append(appointments[i] +"\n");
                //tum appointment objeleri index numarsindan baslayarak yazdir
                //\n bu da bir sonraki satira gecirir
            }
            // bw.append(appointments[0] +"\n"); Sadece 1 obje yazdir
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}