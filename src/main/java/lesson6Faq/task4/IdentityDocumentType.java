package lesson6Faq.task4;

public enum IdentityDocumentType {
    MILITARY_ID("07","Военный билет"),
    DIPLOMATIC_pASSPORT("09","Дипломатический паспорт"),
    FOREIGN_CITIZEN_PASSPORT("10","Паспорт иностранного гражданина"),
    RUSSIAN_CITIZEN_PASSPORT("21","Паспорт гражданина Российской Федерации"),
    INTERNATIONAL_PASSPORT("22","Загранпаспорт гражданина Российской Федерации");
    private String code;
    private String descriptionOfDocument;

    IdentityDocumentType(String code, String descriptionOfDocument) {
        this.code = code;
        this.descriptionOfDocument = descriptionOfDocument;

    }

    public String getDescriptionOfDocument() {
        return descriptionOfDocument;
    }
    public String getCode(){
        return code;
    }

    public static IdentityDocumentType byCode(String code) {
        for (IdentityDocumentType documentType : values()) {
            if (documentType.code.equals(code)) return documentType;
        }
        return null;
    }
}
