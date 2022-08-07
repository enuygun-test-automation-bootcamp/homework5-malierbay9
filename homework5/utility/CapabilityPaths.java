package homework5.utility;

public enum CapabilityPaths {
    //Bu enum ile capability içeren json dosyalarının pathlerine ulaşabiliyoruz.
    CAPSET1("C:\\Users\\malie\\IdeaProjects\\homework5-malierbay9\\homework5\\resources\\caps\\testPhone.json"),
    CAPSET2("C:\\Users\\malie\\IdeaProjects\\homework5-malierbay9\\homework5\\resources\\caps\\testPhone2.json");

    String path;

    CapabilityPaths(String path) {
        this.path=path;
    }

}
