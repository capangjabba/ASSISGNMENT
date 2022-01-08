package labreport.labreport2.q2;

import java.util.Arrays;

public class Song {
    private static String song[][] = new String[20][5];

    private static int i=0;
    private static int j=0;

    public Song(String title, String filename, String singer, String duration, String year){
        this.song[i][0]=title;
        this.song[i][1]=filename;
        this.song[i][2]=singer;
        this.song[i][3]=duration;
        this.song[i][4]=year;

        ++i;
    }

    public void sortTitle(){
        for (int a=0;a<i-1;a++){
            for (int b=0;b<i-a-1;b++){
                if (Character.compare(song[b][0].charAt(0),song[b+1][0].charAt(0))>0){
                    String temp[]=song[b];
                    song[b]=song[b+1];
                    song[b+1]=temp;
                }
            }
        }



        System.out.println(toString());
    }

    public void sortDuration(){
        for (int a=0;a<i-1;a++){
            for (int b=0;b<i-a-1;b++){

                if (Double.valueOf(song[b][3])>Double.valueOf(song[b+1][3])){
                    String temp[]=song[b];
                    song[b]=song[b+1];
                    song[b+1]=temp;
                }
            }

        }

        System.out.println(toString());
    }

    public String searchTitle(String title){
        String bruh="";
        for (int a=0;a<20;a++){
            if (title.equals(song[a][0])){
                for (int b=0;b<5;b++){
                    bruh+=song[a][b]+" ";
                }
            }
        }
        return bruh;
    }

    public String searchSinger(String singer){
        String bruh="";
        for (int a=0;a<20;a++){
            if (singer.equals(song[a][2])){
                for (int b=0;b<5;b++){
                    bruh+=song[a][b]+" ";
                }
            }
        }
        return bruh;
    }

    public String play(){
        String bruh="";
        for (int a=0;a<5;a++){
            bruh+=song[j][a]+" ";
        }
        if (j==20){
            j=0;
        }else {
            j++;
        }
        return bruh;
    }
    public String next(){
        j++;
        if (j>20){
            j=0;
        }
        String bruh="";
        for (int a=0;a<5;a++){
            bruh+=song[j][a]+" ";
        }
        if (j==20){
            j=0;
        }else {
            j++;
        }
        return bruh;
    }

    public String previous(){
        j--;
        if (j<0){
            j=20;
        }
        String bruh="";
        for (int a=0;a<5;a++){
            bruh+=song[j][a]+" ";
        }
        if (j==20){
            j=0;
        }else {
            j++;
        }
        return bruh;
    }


    public String toString(){
        String lesgo="";
        for (int a=0;a<i;a++){
            for (int b=0;b<5;b++){

                lesgo+=song[a][b]+" ";
            }
            lesgo+="\n";
        }
        return lesgo;
    }

}
