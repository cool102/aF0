package lesson6Faq.task4;

import java.util.Random;

public class IdentityDocument {
    private IdentityDocumentType documentType;
    private String id;

    public IdentityDocument(IdentityDocumentType documentType,String id){
        this.documentType = documentType;
        this.id = id;
    }

    public IdentityDocumentType getIdentityDocumentType(){
        return documentType;
    }
    public String getId(){
        return id;
    }

    public static IdentityDocument random(){

        IdentityDocumentType documentType = IdentityDocumentType.values()[new Random().nextInt(IdentityDocumentType.values().length)];
        String id = StringGenerator.getRandomSerailNumber(documentType);
        return new IdentityDocument(documentType, id);
    }

}
