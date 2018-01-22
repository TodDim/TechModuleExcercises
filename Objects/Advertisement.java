package Objects;
import java.util.Random;
public class Advertisement {
    private static final String [] Praise_Phrases ={"Продуктът е отличен. ","Това е страхотен продукт. ","Постоянно ползвам този продукт. "
            ,"Това е най-добрият продукт от тази категория. "};
    private static final String[] Praise_Facts ={"Вече се чувствам добре. ","Успях да се променя. ","Той направи чудо. ","Не мога да повярвам, но вече се чувствам страхотно. "
    ,"Опитайте и вие. Аз съм много доволна. "};
    private static final String[] FirstName = {"Диана ", "Петя ", "Стела ", "Елена ", "Катя "};
    private static final String [] SecondName ={"Иванова ", "Петрова ", "Кирова "};
    private static final String [] Cities ={"София", "Пловдив", "Варна", "Русе", "Бургас"};
    private static Random rnd = new Random();
    public static void main(String[] args) {
        StringBuilder phrase = new StringBuilder();

            String praise_Phrases=generateString(Praise_Phrases);
            phrase.insert(0,praise_Phrases);

            String praise_Facts=generateString(Praise_Facts);
            phrase.insert(praise_Phrases.length(),praise_Facts);

            String firstName=generateString(FirstName);
            phrase.insert(+praise_Phrases.length()+praise_Facts.length(),firstName);

            String secondName=generateString(SecondName);
            phrase.insert(praise_Phrases.length()+praise_Facts.length()+firstName.length(),secondName);

            String cities=generateString(Cities);
            phrase.insert(praise_Phrases.length()+praise_Facts.length()+firstName.length()+secondName.length(),cities);

        System.out.println(phrase);
    }
    private static String generateString(String[] availableStrings) {
        int randomIndex = rnd.nextInt(availableStrings.length);
        String randomString = availableStrings[randomIndex];
        return randomString;
    }
}
