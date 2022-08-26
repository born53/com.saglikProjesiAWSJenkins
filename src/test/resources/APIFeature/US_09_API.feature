Feature: Patient bilgilerini doğrulama

  @US009_API
  Scenario:
    Given Kullanıcı staff "160151" kimliğine sahip hasta verileri için bir alma isteği icin get request gönderir
    And kullanıcı staff durum kodunun 200 olduğunu doğrular
    Then kullanıcı, beklenen verilerle hasta bilgilerini doğrular