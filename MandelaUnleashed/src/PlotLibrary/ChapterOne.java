/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package PlotLibrary;

public class ChapterOne {
    String[] ch1;
    String[] wrong1;
    String[] wrong2;
    public ChapterOne(){
        ch1 = new String[3];
        wrong1 = new String[1];
        wrong2 = new String [1];
        ch1[0] = "Chapter One\n\n";
        ch1[1] = "Some story\n";
        ch1[2] = "Choice 1: Right \n Choice 2: Wrong \n Choice 3: Wrong\n";
        ch1[3] = "Right choice";
        wrong1[0] = "Bad choice\n";
        wrong1[1] = "Game over 1";
        wrong2[0] = "Bad choice\n";
        wrong2[1] = "Game over 2";
    }
    public String print(int num) {
        return ch1[num];
    }
}//end class ChapterOne