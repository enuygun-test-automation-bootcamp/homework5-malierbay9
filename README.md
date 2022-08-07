# Homework 5

Verilen ödev doğrultusunda Add Contact uygulaması için istenen test
senaryolarının Appium yardımıyla otomasyonu yazılmıştır.

## Açıklama

### Resources Paketi

[aps](https://github.com/enuygun-test-automation-bootcamp/homework5-malierbay9/tree/main/homework5/resources/apps) içinde test edilecek uygulama mevcut.

/caps içerisinde kullanılan capability lerin json dosyaları mevcut.

### Utility Paketi

AppiumLocalStarter - Appium u local olarak çalıştırmayı kolayca sağlayan sınıf.

CapabilitySettings - Gereken capability değerlerini Json dosyasından alıp kullanacağımız yere Json'dan Capability olarak convert edip, döndürmeye yarayan sınıftır.

DriverManager - Kullanılan driver ı üreten sınıf.

Helper - Kolayca wait kullanmayı sağlar.

### Pages Paketi

Uygulamanın Page Object Model Sınıfları burada bulunur.


### Tests Paketi

Test sınıfları bu pakette bulunur.

BaseTest sınıfında Testlerin öncesinde ve sonrasında yapılması gereken eylemler bulunur.
Bu sınıf testlerin bulunduğu Tests sınıfında inherit edilir.


## Dikkat Edilmesi Gerekenler
-Projenin başka ortamlarda kullanılması durumunda resources/caps içinde Capability içeren Json dosyalarında , test edilen uygulamanın
path inin verildiği "app" capability sinin değerinin değiştirilmesi gerekebilir.

-Yine aynı şekilde Capability içeren Json dosyalarının pathleri, CapabilityPaths enum unda doğru verilmelidir.

-Normalde verilen senaryoların bazıları, test edilen uygulamanın sıkıntılarından dolayı (Klavyeyi element olarak alamamız gibi ya da
hiçbir yerde herhangi bir karakter tür veya sayısı kısıtı olmaması) gerçekleştirilememiştir. Bunların yerine başka testler yapılmıştır.


