package chapter_12.section_12_2;

public class LibraryAi {
    public static void main(String[] args) {
        int[] pageCounts = new int[5];

        pageCounts[0] = 320;
        pageCounts[1] = 180;
        pageCounts[2] = 480;
        pageCounts[3] = 780;
        pageCounts[4] = 930;

        System.out.println("冊数は " + pageCounts.length + " 冊です");
        System.out.println("1冊目は " + pageCounts[0] + " ページです");
        System.out.println("3冊目は " + pageCounts[1] + " ページです");
        System.out.println("5冊目は " + pageCounts[4] + " ページです");
    }
}
