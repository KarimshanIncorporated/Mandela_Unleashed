/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package PlotLibrary;

public class ChapterOne {
    String[] ch1;
    String[] path2;
    String[] path3;
    int currentPath;
    
    public ChapterOne(){
        ch1 = new String[4];
        path2 = new String[2];
        path3 = new String [2];
        currentPath = 1;
        ch1[0] = "Chapter One\n\n";
        ch1[1] = "Some story\n";
        ch1[2] = "Choice 1: Right \n Choice 2: Wrong \n Choice 3: Wrong\n";
        ch1[3] = "Right choice";
        
        path2[0] = "Bad choice\n";
        path2[1] = "Game over 1";
        path3[0] = "Bad choice\n";
        path3[1] = "Game over 2";
    }
    
    public String print(int num) {
        return "";
    }
    public void setPath(int num ,int path) {
        if(num == 2) {
            
        }
        
    }
    public boolean isChoice(int num) {
        if(num == 2){
            return true;
        }
        return false;
    }
    
    public boolean isWrongChoice() {
        if(currentPath == 2 || currentPath == 3) {
            return true;
        }
        return false;
    }
    
    public String[] getCurrentArray() {
        if(currentPath == 2) {
            return path2;
        }
        if(currentPath == 3) {
            return path3;
        }
        return ch1;
    }
}//end class ChapterOne