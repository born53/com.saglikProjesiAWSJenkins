

Feature: US09 "Staff (Personel), hasta bilgilerini gorebilmeli,duzenleyebilmeli
  ve silebilmelidir.API ve DB kullanarak bunlari dogrulayin"

  @US_09_Medunna
  Scenario: TC01 My Pages" sekmesinden hasta bilgilerini gorebilmelidir.

    Given Kullanici (staff) Ana sayfaya gider.
     And  Kullanici (Staff) profil simgesine tiklar.
     And  Kullanici (Staff ) sing in sekmesini tiklar
     And  Kullanici (staff) Username ve Password girer.
     And  Kullanici(staff) Sing in butonuna tiklar
     And  Kullanıcı (staff) MY PAGES'e tıklar.
     And  Kullanici(staff) search Patient sekmesine tiklar.
     And  Kullanici (staff) patients  goruldugunu dogrular.
     And  Kullanici (staff) ID  goruldugunu dogrular.
     And  Kullanici (staff) SSN  goruldugunu dogrular.
     And  Kullanici (staff) FirstName  goruldugunu dogrular.
     And  Kullanici (staff) LastName  goruldugunu dogrular.
     And  Kullanici (staff) BirthDate goruldugunu dogrular.
     And  Kullanici (staff) Phone  goruldugunu dogrular .
     And  Kullanici (staff) Email  goruldugunu dogrular.
     And  Kullanici (staff) Gender  goruldugunu dogrular.
     And  Kullanici (staff) BloodGroup  goruldugunu dogrular.
     And  Kullanici (staff) Address  goruldugunu dogrular.
     And  Kullanici (staff) Description  goruldugunu dogrular.
     And  Kullanici (staff) CreatedData  goruldugunu dogrular.
     And  Kullanici (staff) User  goruldugunu dogrular.




 Scenario Outline:TC02 Kullanıcı bütün hasta bilgilerini "id, firstname, lastname, birthdate, email, phone, gender, blood group,address, description, user, country and state/city" düzenleyebilmelidir.

    Given Kullanici (staff) Ana sayfaya gider.
    And  Kullanici (Staff) profil simgesine tiklar.
    And  Kullanici (Staff ) sing in sekmesini tiklar
    And  Kullanici (staff) Username ve Password girer.
    And  Kullanici(staff) Sing in butonuna tiklar
    And  Kullanıcı (staff) MY PAGES'e tıklar.
    And  Kullanici(staff) search Patient sekmesine tiklar.
    And  Kullanici (staff)  Hasta SSN'si  girer.
    And  Kullanici (staff) edit butonuna tiklar
    And  Kullanici (staff) id numarasi "<id>" girer.
    And  Kullanici (staff) Adini "<firstname>" girer.
    And  Kullanici (staff) soy ismini "<lastname>" girer.
    And  Kullanici (staff) dogum tarihini ve saatini "<birthdate>" girer.
    And  Kullanici (staff) email linkini "<email>" girer.
    And  Kullanici (staff) telefonunu "<phone>" girer.
    And  Kullanici (staff) cinsiyetini "<gender>" girer.
    And  Kullanici (staff) kan grubunu "<bloodgroup>" girer.
    And  Kullanici (staff) adresini "<address>" girer.
    And  Kullanici (staff) hastanin rahatsizligini "<description>" girer.
    And  Kullanici (staff) kullanici ismini "<user>" girer.
    And  Kullanici (staff) ulkeyi "<country>" girer.
    And  Kullanici (staff) kaldigi sehri "<state/city>" girer.

      Examples:Patient Bilgileri
      |id      |firstname  |lastname  |birthdate          | phone       | email                           |gender |bloodgroup  |address             |description       | user                                              |country |state/city|
      |169378  |mustafa    |zafer     |09/08/192922:22    | 0555555555  | mustafazafermedunna@gmail.com   |erkek  |   B+       |papatya sokak no:11 |Kalp              |user_112233445_56677889991657123742123             |Canada  |FIRENK    |



  Scenario:TC_03 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.

    Given Kullanici (staff) Ana sayfaya gider.
    And  Kullanici (Staff) profil simgesine tiklar.
    And  Kullanici (Staff ) sing in sekmesini tiklar
    And  Kullanici (staff) Username ve Password girer.
    And  Kullanici(staff) Sing in butonuna tiklar
    And  Kullanıcı (staff) MY PAGES'e tıklar.
    And  Kullanici(staff) search Patient sekmesine tiklar.
    And  Kullanici (staff)  yeni basvurunun hasta SSN'si  girer.
    And  Kullanici (staff) yeni basvurunun tum kayit bilgilerini dolduruldugunu dogrular.


  Scenario:TC_04 Kullanici herhangi bir hasta bilgisini silebilir.

    Given Kullanici (staff) Ana sayfaya gider.
    And  Kullanici (Staff) profil simgesine tiklar.
    And  Kullanici (Staff ) sing in sekmesini tiklar
    And  Kullanici (staff) Username ve Password girer.
    And  Kullanici(staff) Sing in butonuna tiklar
    And  Kullanıcı (staff) MY PAGES'e tıklar.
    And  Kullanici(staff) search Patient sekmesine tiklar.
    And  Kullanici (staff)  Hasta SSN'si  girer.
    And  Kullanici (staff) edit butonuna tiklar
    And  Kullanici (staff)  Hasta telefonunu siler.

  Scenario:TC_05  Staff hastalari silememeli.

    Given Kullanici (staff) Ana sayfaya gider.
    And  Kullanici (Staff) profil simgesine tiklar.
    And  Kullanici (Staff ) sing in sekmesini tiklar
    And  Kullanici (staff) Username ve Password girer.
    And  Kullanici(staff) Sing in butonuna tiklar
    And  Kullanıcı (staff) MY PAGES'e tıklar.
    And  Kullanici(staff) search Patient sekmesine tiklar.
    And  Kullanici (staff)  hastalari silemedigini dogrulamali

  Scenario:TC_06 Staff, hastalari SSN kimliklerine gore arayabilir.

    Given Kullanici (staff) Ana sayfaya gider.
    And  Kullanici (Staff) profil simgesine tiklar.
    And  Kullanici (Staff ) sing in sekmesini tiklar
    And  Kullanici (staff) Username ve Password girer.
    And  Kullanici(staff) Sing in butonuna tiklar
    And  Kullanıcı (staff) MY PAGES'e tıklar.
    And  Kullanici(staff) search Patient sekmesine tiklar.
    And  Kullanici (staff)  Hasta SSN nosu  girerek arayabilir.


