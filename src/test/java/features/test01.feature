Feature: kontrol
  @tag
  Scenario: Logo görünüyor mu?
    Given OBSS adresine git
    And çerezleri kabul et
    Then Logoyu kontrol et
    Then tarayıcıyı kapat


