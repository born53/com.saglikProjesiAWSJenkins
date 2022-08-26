@US028

Feature: US_028_Admin olarak; Country olusturma / Okuma ve Silme

  Background:
    Given Kullanici Medunna Url'ye gider
    When  Kullanici  profil simgesine tiklar.
    And   Kullanici  sing in sekmesini tiklar
    Then  Kullanici oturum acma acilir penceresini dogrular.
    When  Kullanici Username ve Password girer ve  sing in sekmesini tiklar.
    And   Kullanici items&Titles button sekmesini tiklar.

  @country_creation
  Scenario: TC01_Kullanici yeni bir Country olusturur.
    And  Kullanici Country tiklar.
    Then Kullanici Countries sayfasinin acildigini dogrular.
    When Kullanici Create or edit a Country dugmesine tiklar
    And  Kullanici Country adini girer.
    And  Kullanici Country sayfasindaki save dugmesine tiklar
    Then Kullanici yeni kimlik numarasi mesajiyla yeni bir Country olusturuldugunu dogrular
    And  Kullanici, yeni olusturulan Country nin listede  gorundugunu dogrular.
    And  Kullanici yeni olusturulan Country  ve kimligi kaydeder.
    And  Kullanici  tarayicisini kapatir.

  @state_creation
  Scenario: TC02_Kullanici, Country'ye göre ilgili eyaletler veya sehirler olusturabilmelidir.
    And  Kullanici State City tiklar.
    And  Kullanici yeni bir Create or edit a State City olustur dugmesine tiklar
    Then Kullanici Create or edit a State City sayfasinin acildigini dogrular.
    When Kullanici acilir listesinden yeni olusturulan ulkeyi secer.
    When Kullanici sectigi ulkeye gore State City bolumune sehri girer.
    And  Kullanici save dugmesini tiklar.
    Then Kullanici yeni bir State City olusturuldugunu dogrular.
    And  Kullanici  tarayicisini kapatir.

  @country_deletion
  Scenario: TC03_Kullanici ulkeleri silebilmelidir.
    And  Kullanici Country tiklar.
    Then Kullanici her hangi bir ulkeyi bulur ve Sil dugmesine tiklar.
    When Kullanici yeni olusturdugu ulkeyi bulur ve Sil dugmesine tiklar.
    And  Kullanici uyari mesajini dogrular
    And  Kullanici ulke'nin basariyla silindigini dogrular.
    Then Kullanici silinen ulkenin ulke listesinde gorunmedigini dogrular.
    And  Kullanici  tarayicisini kapatir.
