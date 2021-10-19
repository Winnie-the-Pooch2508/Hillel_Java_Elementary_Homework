package com.company.hm2;

public class jewels_stones {
    public int numJewelsInStones(String jewels, String stones) {

        int numOfJewelsYouHave = 0;

        char[] jewelsExist = jewels.toCharArray();
        char[] stonesIHave = stones.toCharArray();

        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            count++;
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (stonesIHave[j] == jewelsExist[i]) {
                    numOfJewelsYouHave++;
                }
            }
        }
        return numOfJewelsYouHave;
    }
}
