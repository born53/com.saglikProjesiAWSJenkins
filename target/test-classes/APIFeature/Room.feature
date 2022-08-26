Feature:Room test API

@RoomGET
  Scenario:Room api with GET request/Room api testi

    Given kullanici roomlar icin get request yapar
    And kullanici gelen room datayi deserialize eder
    Then kullanici room datasini validate eder

  @RoomPOST
  Scenario:Post request validation
    Given kullanici roomlar icin post request yapar
    Then kullanici post request validation yapar

    @PutRequest
    Scenario:Put request roomlar icin
      Given kullanici roomlar icin put request yapar
      Then kullanici put request validation yapar

      @DeleteRequest
      Scenario Outline:Delete rooms icin
        Given kullanici Delete request eder "<id>"
        Then delete validation
        Examples:test data (ids)
        |id|
        |11552|