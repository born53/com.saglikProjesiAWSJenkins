Feature:US_010 Doktor randevu bilgileri db

@dbus10
Scenario: US_010 TC_004 Doktor DB ile hasta randevularini gorur
Given Doktor Sinem DB ile baglanti olusturur
Given Doktor Sinem DB'e sorgu gonderir randevu id si ile hasta bilgilerini alir
Then Doktor Sinem bilgileri dogrular ve kaydeder