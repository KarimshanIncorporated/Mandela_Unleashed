/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package PlotLibrary;

public class ChapterTwo {
    String[] ch2;
    public ChapterTwo() {
        ch2 = new String[22];
        ch2[0] = "Chapter 2: 9000 Days";
        ch2[1] = "During the five years of your imprisonment, the government raided and plundered a farm, a secret spot used to discuss the MK operations. "
                + "Finding thousands of documents of evidence that you were behind the bombings, the prosecutor demanded the death penalty.";
        ch2[2] ="After the original case was thrown out, you now stand before the judge and prosecutor of the Rivonia trial, being accused for "
                + "bombing and sabotaging the government buildings. “You Nelson Mandela, are being charged recruiting those for the sake of sabotage and bombing purposes, conspiring against us to commit these acts and aiding the foreign military, acting in ways to further communism, and soliciting and receiving money from sympathizers outside of South Africa."
                + " With the aid of thousands of documents and 173 witnesses against you, what is your defense?”  ";
        //choice
        ch2[3] ="1) In the stead of your defense, use your time to speak of the greatness of the ANC and MK and help them gain popularity, by explaining how through their actions in the future will Africa come to prosper and equality will increase.\n" +
"\n" +
"2) Try to convince the judge that you are not wrong, and that you are not deserving of this trial nor the punishments. ";
        ch2[4] ="I have fought against white domination, and I have fought against black domination. I have cherished the ideal of a democratic and free society in which all persons will live together in harmony with equal opportunities. It is an ideal which I hope to live for, and to see realised."
                + " But my Lord, if needs be, it is an ideal for which I am prepared to die.” ";
        ch2[5] ="Since you and the others admitted guilt, the judge decided not to give death sentence and instead a sentence of life imprisonment. ";
        ch2[6] ="Admitting to your wrongdoings, you are sentenced to a life in prison. However, by making this choice, you have managed to increase the popularity and strength of the ANC and MK. You and the co-accused were taken to Robben Island Prison. ";
        ch2[7] ="Though to your country, you are the symbol of justice, and a hero, to the government, you are trash, and just another tool at their disposal. They listed you as a class D prisoner, and day after day, you spend your time in the limestone quarry, picking away at the stone and being bombarded by bright sunlight being reflected off the limestone. Furthermore, were not allowed to wear sunglasses which caused the brightness to inflict irreversible damage upon your eyes. ";
        ch2[8] ="Slowly as time went by, conditions improve improve in prison. However, it is still nowhere you want to be. In 1969, other prisoners and the co-accused come up with a plan to escape the hell of an island you are stranded on. ";
        //choice
        ch2[9] ="1) “Friends, brothers. As much as we hate this place, we cannot just simply run away. The plan may seem foolproof, but they will just keep coming for us, and sooner or later we will end up dead. We should not see this through.”\n" +
"\n" +
"2) “We’ve been locked up in the dreaded hell for too long my friends. I am ready to leave and finish my work. We will see through the plan tomorrow at the break of dawn. Godspeed.” ";
        ch2[10] ="The other inmates and friends agree with you, wiping all traces of the plan so the boss would not get any ideas. The boss wished that the inmates saw through with the plans, in order to have an excuse to ride of you. Luckily, you did not see through with it. ";
        ch2[11] =" You spend your days working the limestone quarry and continuing the slave labor. One day, the glory of God shines upon you, and the commanding officer of the prison is replaced by a much kinder, "
                + "Commander Willie Willemse. He is cooperative and works to improve the conditions of the prison as much as he can. After much negotiation, in April, 1982, he manages to transfer you and the other members of the ANC to Pollsmoor Prison in Cape Town.";
        ch2[12] ="As you spend your days, rotting away in the dark cell, you hear rumors from the guards revolving around you. All across the nation, protests and violence increases, all due to your imprisonment. Nations across the world want you free and demand you have done nothing wrong. ";
        ch2[13] ="Many nations in Africa and across the world stop investing in South Africa. The banks stop lending and aiding their financial crisis and put more pressure on the government for the sake of your release. In 1985,  the government was too pressured and in a wreck so they offered you a deal. You may be released, on the condition that you vow for non violence. ";
        //choice
        ch2[14] ="1) Agree\n" +
"\n" +
"2) Disagree ";
        ch2[15] ="“What freedom am I being offered while the organization of the people remains banned? Only free men can negotiate. A prisoner cannot enter into contracts,” ";
        ch2[16] ="After declining their offer, the government transferred you to Victor Vestor Prison, your new home. You spend 5 years here, while outside the prison, the people are still wreaking havoc in South Africa and the government is being pressure and scolded."
                + " In 1990, the government releases you and the people rejoice. ";
        
        //Wrong Choices
        ch2[17] = "Pleading your case, the judge allows you to speak and sends the jury to discuss the further means. Coming back out, the jury finds you guilty, and gives you your original sentence to death.";
        ch2[18] = "The first group of prisoners manage to break out their cells after sneaking away a key from the guards and set you free. As you and the others run towards the back of the prison, you see the light of freedom. You touch the gates when you hear the fire of a gun from behind you.";
        ch2[19] = "The steel penetrates right through your back and into your heart, the blood pouring out nonstop. You look behind to see a new warden, one you have yet to meet. As you fall, you hear in a dissociated tone more gunshots, your comrades falling down with you, fading away in the cold floors of the prison.";
        ch2[20] = "You walk away from the horrible building of your conviction and reunite with your brothers in the ANC. You spend your days speaking of the horrors you have been forced to deal with, the mining and the horrible wardens.";
        ch2[21] = "It isn’t long before the government intrude on the ANCs plans. Without being able to do any violent attacks, the government shuts down and destroys the current ANC. Now everything you have worked for had been destroyed and torn apart. No matter how much you try to bring up the idea, the government doesn’t flinch and stops all your attempts without a second thought. ";
        
    }
    
    public String print(int num) {
        return ch2[num];
    }
    
    public boolean isChoice(int num) {
        return(num == 3 || num == 9 || num == 14);
    }
    public boolean isBadEnd(int num) {
        return(num == 17 || num == 19 || num == 21);
    }
    
    public boolean isEnd(int num) {
        return(num == 16);
    }
}//end class ChapterTwo