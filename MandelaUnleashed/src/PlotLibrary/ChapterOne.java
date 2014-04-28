/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package PlotLibrary;

public class ChapterOne {
    String[] ch1;
    
    public ChapterOne(){
        ch1 = new String[2];
        ch1[0] = "Prologue: The year was 1918. South Africa has been shattered and disunited for many years, and many more to come. In a small village of Mvezo, along the banks of the Mbashe River, you would be born, Rolihlahla Mandela, more commonly known as Nelson Mandela, Belonging to the Xhosa clan, your name, Rolihlahla, meaning troublemaker, was more known as \"Madiba,\" or your clan name, for your early years. Being born into a Methodist family, as you started school at the age of seven, the name Nelson was given to you by your teacher as you were baptised. Two years later, your beloved father has passed away. In order to cope with his death, you would form a strong bond with his faith and mother, going to sunday service every week and attending a Methodist mission school. Years pass, as you enter your thirties. Now, you will begin your law studies at the University of Witwatersrand at Johannesburg. This is where your dream and work shall be born. The year is 1944, and change is in the making.";
        ch1[1] = "";
    }
    public String print(int num) {
        return ch1[num];
    }
}//end class ChapterOne