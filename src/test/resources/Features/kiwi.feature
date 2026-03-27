Feature: Kiwi uygulama testi yapilir
@kiwi
  Scenario:
    Given Continue as a guest butonuna tiklanir
   # When Acilan sayfalarda "Continue" ve "Explore the app"  tiklanir
    When Acilan sayfalarda Continue ve Explore the app tiklanir
    When Trip type one way olarak secilir
    When Kalkıs sehri secenegine tiklanir ve default olan sehir kaldirilir
    When Kalkıs sehri alanina Ankara yazilir ve Choose butonuna tiklanir
    When Varış sehri alanina Frankfurt yazilir ve Choose butonuna tiklanir
    When Gidiş tarihi alanindan 21 Eylul secilir ve Set Date butonuna tiklanir
    When Search butonuna tiklanir
    When En ucuz ve Aktarmasiz filtrelemeleri yapilir
    Then Gelen ilk bilet fiyati kaydedilir ve kullanicinin telefonuna SMS olarak gonderilir