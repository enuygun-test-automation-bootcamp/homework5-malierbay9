# Homework 5

Verilen ödev doğrultusunda Add Contact uygulaması için istenen test
senaryolarının Appium yardımıyla otomasyonu yazılmıştır.

## Açıklama

### Resources Paketi

[apps](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/tree/main/homework5/resources/apps) içinde test edilecek uygulama mevcut.

[caps](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/tree/main/homework5/resources/caps) içerisinde kullanılan capability lerin json dosyaları mevcut.

### Utility Paketi

[AppiumLocalStarter](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/blob/main/homework5/utility/AppiumLocalStarter.java) - Appium u local olarak çalıştırmayı kolayca sağlayan sınıf.

[CapabilitySettings](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/blob/main/homework5/utility/CapabilitySettings.java) - Gereken capability değerlerini Json dosyasından alıp kullanacağımız yere Json'dan Capability olarak convert edip, döndürmeye yarayan sınıftır.

[DriverManager](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/blob/main/homework5/utility/DriverManager.java) - Kullanılan driver ı üreten sınıf.

[Helper](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/blob/main/homework5/utility/Helper.java) - Kolayca wait kullanmayı sağlar. Kolaylık sağlaması için başka metotlar da eklenebilir.

### Pages Paketi

Uygulamanın Page Object Model Sınıfları burada bulunur.


### Tests Paketi

Test sınıfları bu pakette bulunur.

[BaseTest](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/blob/main/homework5/tests/BaseTest.java) sınıfında Testlerin öncesinde ve sonrasında yapılması gereken eylemler bulunur.
Bu sınıf testlerin bulunduğu [Tests](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/blob/main/homework5/tests/Tests.java) sınıfında inherit edilir.


## Dikkat Edilmesi Gerekenler
-Projenin başka ortamlarda kullanılması durumunda [caps](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/tree/main/homework5/resources/caps) içinde Capability içeren Json dosyalarında , test edilen uygulamanın
path inin verildiği "app" capability sinin değerinin değiştirilmesi gerekebilir.

-Yine aynı şekilde Capability içeren Json dosyalarının pathleri, [CapabilityPaths](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/blob/main/homework5/utility/CapabilityPaths.java) de doğru verilmelidir.

-Normalde verilen senaryoların bazıları, test edilen uygulamanın sıkıntılarından dolayı (Klavyeyi element olarak alamamız gibi ya da
hiçbir yerde herhangi bir karakter tür veya sayısı kısıtı olmaması) gerçekleştirilememiştir. Bunların yerine başka testler yapılmıştır.


