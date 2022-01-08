package labreport.labreport2.q2;

public class q2 {
    public static void main(String[] args) {
        Song a1 = new Song("NDA","mp4","BILLIE EILISH","4.40","2021");
        Song a4 = new Song("WITHOUT YOU","mp4","EMINEM","6.20","2018");
        Song a2 = new Song("STARBOY","mp4","THE WEEKND","2.40","2018");
        Song a3 = new Song("OFF THE GRID","mp4","KANYE","3.20","2018");




        System.out.println(a2.toString());

        a3.sortTitle();
        a3.sortDuration();

    }
}
