Feature: Homework
  Scenario: Homework Case - 1
    Given Uygulama acilir
    When "ERKEK" menüsünün üzerine gelinir
    When "Polo Yaka Tişört" butonuna tıklanır
    Then "Erkek Polo Yaka Tişört" sayfasının geldiği kontrol edilir
    When "Beden Ara" filtresine "M" yazılır
    When "M" onay kutucuğuna tıklanır
    When "Renk Ara" filtresine "Bordo" yazılır
    When "Bordo" onay kutucuğuna tıklanır
    When "Sırala" butonundan "En düşük fiyat" seçilir
    Then "Bordo" renkli "M" bedenli "Polo Yaka Tişört"lerin en ucuzdan en pahalıya doğru sıralandığı kontrol edilir
    When 1. sıradaki ürün seçilir
    Then En ucuz "Bordo" renkli "M" bedenli "Polo Yaka Tişört" seçilmiş mi kontrol edilir
    When "Paylaş" butonuna tıklanır
    When "Kopyala" butonuna tıklanır
    Then Kopyalanan link ile sayfanın linki aynı mı kontrol edilir




