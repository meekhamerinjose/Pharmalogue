package pillapp.model;

import android.content.Context;

import java.net.URISyntaxException;
import java.util.List;

public class Drug {


    private long drugId;
    private String drugGenericName;
    private String drugBrandName;
    private String drugPrescriptionDetails;
    private String drugContraindications;
    private String drugPregnancyCategory;
    private String drugDosage;
    private String drugWarnings;
    private String drugSideEffects;
    private String drugInteractions;

    public Drug() {
        this.drugGenericName = "";
        this.drugBrandName = "";
        this.drugPrescriptionDetails = "";
        this.drugContraindications = "";
        this.drugPregnancyCategory = "";
        this.drugDosage = "";
        this.drugWarnings = "";
        this.drugSideEffects = "";
        this.drugInteractions = "";
    }

    public Drug(String drugBrandName,
                String drugGenericName,
                String drugPrescriptionDetails,
                String drugContraindications,
                String drugPregnancyCategory,
                String drugDosage,
                String drugWarnings,
                String drugSideEffects,
                String drugInteractions) {
        this.drugBrandName = drugBrandName;
        this.drugGenericName = drugGenericName;
        this.drugPrescriptionDetails = drugPrescriptionDetails;
        this.drugContraindications = drugContraindications;
        this.drugPregnancyCategory = drugPregnancyCategory;
        this.drugDosage = drugDosage;
        this.drugWarnings = drugWarnings;
        this.drugSideEffects = drugSideEffects;
        this.drugInteractions = drugInteractions;
    }

    public long getDrugId() {
        return drugId;
    }

    public void setDrugId(long drugId) {
        this.drugId = drugId;
    }

    public String getDrugGenericName() {
        return drugGenericName;
    }

    public void setDrugGenericName(String drugGenericName) {
        this.drugGenericName = drugGenericName;
    }

    public String getDrugBrandName() {
        return drugBrandName;
    }

    public void setDrugBrandName(String drugBrandName) {
        this.drugBrandName = drugBrandName;
    }

    public String getDrugPrescriptionDetails() {
        return drugPrescriptionDetails;
    }

    public void setDrugPrescriptionDetails(String drugPrescriptionDetails) {
        this.drugPrescriptionDetails = drugPrescriptionDetails;
    }

    public String getDrugContraindications() {
        return drugContraindications;
    }

    public void setDrugContraindications(String drugContraindications) {
        this.drugContraindications = drugContraindications;
    }

    public String getDrugPregnancyCategory() {
        return drugPregnancyCategory;
    }

    public void setDrugPregnancyCategory(String drugPregnancyCategory) {
        this.drugPregnancyCategory = drugPregnancyCategory;
    }

    public String getDrugDosage() {
        return drugDosage;
    }

    public void setDrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
    }

    public String getDrugWarnings() {
        return drugWarnings;
    }

    public void setDrugWarnings(String drugWarnings) {
        this.drugWarnings = drugWarnings;
    }

    public String getDrugSideEffects() {
        return drugSideEffects;
    }

    public void setDrugSideEffects(String drugSideEffects) {
        this.drugSideEffects = drugSideEffects;
    }

    public String getDrugInteractions() {
        return drugInteractions;
    }

    public void setDrugInteractions(String drugInteractions) {
        this.drugInteractions = drugInteractions;
    }
}
