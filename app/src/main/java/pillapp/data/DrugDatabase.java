package pillapp.data;

import java.util.ArrayList;

import pillapp.model.Drug;

/**
 * Created by Android SD-1 on 18-04-2017.
 */

public class DrugDatabase {

    public static ArrayList<Drug> drugArrayList = new ArrayList<>();

    static {
        drugArrayList.add(new Drug("Crocin, Fepanil",
                "Paracetamol",
                "This medication is a non-opiate, analgesic and antipyretic, prescribed for headache, pain (muscle ache, backache) and fever either alone or combined with other medications.  It changes the way the body senses pain and cools the body.",
                "Hypersensitivity",
                "B",
                "Adults: 0.5-1gm, 3-6 times daily max 4gm. Children: 15mg/kg/dose or 60mg/kg/24hr divided every 6 hrs. Maximum 5 doses SOS. ",
                "Caution should be exercised in patients with history of asthma, bleeding problems, growths in the nose, heart, kidney or liver disease, liver inflammation, high blood pressure, chickenpox, anxiety, trouble in sleeping, ulcers, stomach problems, stroke, Kawasaki syndrome, any allergy, who are taking other medications, during pregnancy and breastfeeding. \n" +
                        "Avoid alcohol consumption. \n" +
                        "It should not be used in children with infections such as flu, chickenpox or viral infections. \n" +
                        "Avoid large amount of caffeinated beverages while taking this medication. \n" +
                        "It may reduce platelet counts; avoid injury or bruising. ",
                "Nausea, stomach upset, skin rash, acute toxicity may result in liver failure. ",
                "some drugInteractions"));
        drugArrayList.add(new Drug("qwerty",
                "abcdef",
                "This medication is prescribed for ....",
                "Hypersensitivity",
                "B",
                "0.5-1gm",
                "Caution",
                "abc",
                "some drugInteractions"));
        drugArrayList.add(new Drug("asdfgh",
                "abcdef",
                "This medication is prescribed for ....",
                "Hypersensitivity",
                "B",
                "0.5-1gm",
                "Caution",
                "abc",
                "some drugInteractions"));
        drugArrayList.add(new Drug("zcxvb",
                "fghjsdf",
                "This medication is prescribed for ....",
                "Hypersensitivity",
                "B",
                "0.5-1gm",
                "Caution",
                "abc",
                "some drugInteractions"));
        drugArrayList.add(new Drug("piuoyi",
                "fghjdf",
                "This medication is prescribed for ....",
                "Hypersensitivity",
                "B",
                "0.5-1gm",
                "Caution",
                "abc",
                "some drugInteractions"));
        drugArrayList.add(new Drug("wertwert",
                "sdfgsdfg",
                "This medication is prescribed for ....",
                "Hypersensitivity",
                "B",
                "0.5-1gm",
                "Caution",
                "abc",
                "some drugInteractions"));
        drugArrayList.add(new Drug("76586yurtyu",
                "sdfgsdfg",
                "This medication is prescribed for ....",
                "Hypersensitivity",
                "B",
                "0.5-1gm",
                "Caution",
                "abc",
                "some drugInteractions"));
        drugArrayList.add(new Drug("dfuty7fghdf",
                "fgjdfgj",
                "This medication is prescribed for ....",
                "Hypersensitivity",
                "B",
                "0.5-1gm",
                "Caution",
                "abc",
                "some drugInteractions"));
    }

}
