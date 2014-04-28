/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package PlotLibrary;


public class ChapterThree {
    String[] ch3;
    public ChapterThree() {
        ch3 = new String[22];
        ch3[0] = "Chapter 3: A New South Africa";
        ch3[1] = "As you are set free in 1990, nations and countries across the world invite you to come visit them.\n" +
"All over the world, supporters invited you on a tour to their countries including the united States, Japan, Cuba, Sweden, England,  India, and many more.";
        ch3[2] = "1) After the tour, you continue your fight with the government with the MK and continue bombing and harassing them.\n" +
"\n" +
"2) Once back in South Africa, you speak with the government about a ceasefire, because the ANC and MK were at a disadvantage.";
        ch3[3] = "Although your choices led to the unhappiness of some of the MK radicalists, overall they supported your choice because it showed reason and modesty. A year passes and the council elects you to be the president of the ANC, which you gladly accept.";
        ch3[4] = "After, you and the ANC have multiple negotiations with the rest of South Africa. you organize the CODESA meetings twice, however, the negotiations fail and the government would not agree to end the apartheid.";
        ch3[5] = "On September 7, 1992, there were protesters in the town of Bisho. They would get out of hands and result in the officials killing them. This would be known as the Bisho Massacre. 28 ANC supporters die at the hands of government officials and rival political groups.";
        ch3[6] = "1) “I will go speak with President F.W. de Klerk to speak of his unexcusable actions. Let us not take too hasty actions but rather \n" +
"\n" +
"2) “I will not stand for something the likes of this. We declare war on the nationalist party of South Africa, for we will not tolerate this unexcusable injustice!”";
        ch3[7] = "You were chosen to go speak to president F.W. de Klerk to negotiate and speak of the future of the country and what had happened. You speak to him about the rights of blacks, the introduction of democracy and how the country should be governed. After pressuring him about how South Africa will be a wreck if you do not come to a compromise, he agrees that the next election of 1994 will be a democratic vote allowing blacks to vote.";
        ch3[8] = "Three years pass after your release and in 1993, the world gives you the Nobel Peace Prize, alongside President F. W. de Klerk. After receiving the award, you sought to gain financial aid, and asked international banks to aid South Africa’s financial deficit as well as  help you with your campaigning.";
        ch3[9] = "Then finally, the time for elections of the new president of South Africa came. On April 27, 1994, South Africa was inaugurated and the first democratically elected president takes office, you, President Nelson Mandela.";
        ch3[10] = "The first line of business was to end the apartheid of course. Second, you wished to unify all of South Africa, including the Afrikaners. You try to convince all of South Africa, that forgiveness is necessary to move on in the future, and emphasize its importance to the future of Africa. You would spend years preaching this word to the people and trying to convince everyone to stop the segregation.";
        ch3[11] = "A few years later, a time to finally end the segregation that had been haunting the nation had come. The Springboks, South Africa’s national rugby team, had reached the final match for the world finals. Their opponents were none other than the New Zealand All Blacks. The Springboks were composed of all Afrikaners, making them a historically hated team from all the blacks of South Africa.";
        ch3[12] = "1) “The time of hatred has come to an end, and an era of peace, flows through us. Now is not the time to hate one another because the past. Instead, we shall rejoice in happiness, when our team, the South African Springboks  wins the championship!”\n" +
"\n" +
"2) “Tell me. How many years have we been under the control of white men? How many years have their kind treated us like dirt, and didn’t give a damn about us? Listen to me, brothers, sisters. If you truly support the South African made for us, then you will know that the springboks do not deserve to win, nor play for us in that match. They shouldn’t even be in this country!”";
        ch3[13] = "You manage to convince the blacks of South Africa to set aside their differences and support the Springboks, representing their country. The stadium of the final match is filled with many black people, supporting the Springboks and encouraging them to victory.";
        ch3[14] = "With the support of yourself and the country, the Springboks play their all in an epic final match against the New Zealand All Blacks, and pull through a miraculous victory.";
        ch3[15] = "This victory marked a new dawn for South Africa. The trophy you get, you present to the Afrikaners, whom were the true victors and all the blacks support your decision and they all rejoice together. For the first time in history, the black and white men of South Africa were rejoicing in peace and happiness together on the victory of the rugby world championships. This was the future you envisioned and the South Africa you sought to make. Where there is no Apartheid, and where the colors can live together peacefully in happiness.";
        ch3[16] = "Epilogue: Many years pass, and the world has become a better place. Nelson Mandela was a great man, who managed to prove, and achieve many great things in his lifetime. From ending the apartheid, to spreading the idea of non violent protesting, Nelson Mandela has made his mark on the world, and proved that even cats, can get along with dogs.";
        
        //Wrong Choices
        ch3[17] = "The MK continue their guerilla warfare and continue sabotaging and blowing government buildings. Doing so causes the world to lose faith in the  work of the ANC and MK were constructed to keep peace. With the government being in a higher power, the government subdues the MK and ends it once and for all.";
        ch3[18] = "The ANC prepares for the upcoming war, spreading out their forces and the MK across the country. However, the government sees past their plans and stations their garrisons across the country. The government arrests  and deals with the MK and ANC forces before any real war erupts, destroying all plans for unifying South Africa.";
        ch3[19] = "You manage to convince all of South Africa not to support the Springboks, and in the finals, they experience a horrific defeat. This further divides the country and angers the Afrikaners, violent uprisings and protests from them rise all across the nation.";
        ch3[20] = "Soon, this goes way out of your hand to control. you run out of options, and all the white men would not agree to leave. You manage to deport a few but completely purifying the country of the white men was nearly impossible.";
        ch3[21] = "All across the countries, riots, protests, strikes, and much more were happening beyond your control. The vision you had once seeked, to unify all of South Africa in happiness and prosperity burned beneath your eyes, as you become a shadow of your former self. You wished to end the apartheid, but in the end all you managed to do was turn the tides and reroute the power to the blacks, making the white men suffer."; 
    }
    
    public String print(int num) {
        return ch3[num];
    }
    
    public boolean isChoice(int num) {
        return(num == 2 || num == 6 || num == 12);
    }
    public boolean isBadEnd(int num) {
        return(num == 17 || num == 18 || num == 21);
    }
    
    public boolean isEnd(int num) {
        return(num == 16);
    }
}//end ChapterThree