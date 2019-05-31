package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int answer = 0;
        int answer2 = 0;
        int counter1 = 0;
        int counter2 = 1;
        int finalAnswer;

        for(int i = startIndex;i < playList.length;i++){
            if(selection == playList[i]){
                 answer=counter1;
                 break;
            }
            counter1++;
        }
        for(int j = startIndex;j < playList.length;j--){
            if(j == 0){
                j = playList.length-1;
            }
            if(selection == playList[j]){
                answer2=counter2;
                break;
            }
            counter2++;
        }
        finalAnswer = Math.min(answer,answer2);
        return finalAnswer;
    }
}
