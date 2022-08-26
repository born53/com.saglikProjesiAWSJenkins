@US_026
Feature: Herhangi bir kullanici iletisim Mesaji (Contact messages) kullanabilir


  Background:
    Given Kullanici Medunna Url'ye gider
    When  Kullanici İletisim icin contact  tiklar

  Scenario: TC_001_Herhangi bir kullanicinin contact portal ile iletisime gecebilecegini dogrulayin
    Then Herhangi bir kullanicinin iletisim portalina erisebilecegini dogrulayin
    And  Kullanici tarayiciyi kapatir

  Scenario: TC_002_Herhangi bir kullanicinin gecerli kimlik bilgileriyle istek  gonderebilecegini dogrulayin
    When Kullanici gecerli ad, e-posta ve konu girer
    Then Kullanici Gonder dugmesini tiklar
    And  Herhangi bir kullanicinin gecerli kimlik bilgileriyle istek gonderebilecegini dogrulayin
    Then Kullanici tarayiciyi kapatir

  Scenario:TC_003_Kullanicinin gecerli e-posta kutusunu doldurmadan istek  gonderemeyecegini dogrulayin(Negatif test)
    When Kullanici gecerli bir ad ve gecerli bir konu girer ancak e-posta kutusunu bos birakir
    And  Kullanici Gonder dugmesini tiklar
    Then Kullanicinin e-posta kutusunu doldurmadan istek gonderemeyecegini dogrulayin
    And  Kullanici tarayiciyi kapatir

  Scenario:TC_004_Kullanicinin gecerli e-posta yazmadan istek  gonderemeyecegini dogrulayin(Negatif test)
    When Kullanici gecerli bir ad ve gecerli bir konu girer
    Then Kullanici e-posta kutusuna gecersiz bir e-posta yazar
    And  Kullanici Gonder dugmesini tiklar
    Then Kullanici gecerli bir e-posta yazmadan istek gonderemeyecegini dogrulayin
    And  Kullanici tarayiciyi kapatir

  Scenario:TC_005_Kullanicinin ad kutusunu doldurmadan istek gonderemeyecegini dogrulayin(Negatif test)
    When Kullanici gecerli bir e-posta ve gecerli bir konu girer
    Then Kullanici ad kutusunu boş birakir
    And  Kullanici Gonder dugmesini tiklar
    Then Kullanici ad kutusunu doldurmadan istek gonderemeyecegini dogrulayin
    And  Kullanici tarayiciyi kapatir

  Scenario:TC_006_Kullanicinin konu kutusunu doldurmadan istek gonderemeyecegini dogrulayin(Negatif test)
    When Kullanici gecerli bir ad ve gecerli bir e-posta girer
    Then Kullanici konu kutusunu bos birakir
    And  Kullanici Gonder dugmesini tiklar
    Then Kullanici konu kutusunu doldurmadan istek gonderemeyecegini dogrulayin
    And  Kullanici tarayiciyi kapatir

  Scenario:TC_007_Kullanicinin mesaj kutusunu doldurmadan istek gonderebilecegini dogrulayin
    When Kullanici gecerli ad, e-posta ve konu girer
    Then Kullanici mesaj kutusunu bos birakir
    And  Kullanici Gonder dugmesini tiklar
    Then Kullanici mesaj kutusunu doldurmadan bir istek gonderebilecegini dogrulayin
    And  Kullanici tarayiciyi kapatir
