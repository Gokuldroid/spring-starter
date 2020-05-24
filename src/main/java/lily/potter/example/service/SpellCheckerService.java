package lily.potter.example.service;


import lily.potter.example.util.EnglishSpellChecker;
import lily.potter.example.util.TamilSpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

public class SpellCheckerService {

    @Autowired
    EnglishSpellChecker englishSpellChecker;
    @Autowired
    TamilSpellChecker tamilSpellChecker;


    public boolean checkSpelling(String text, String lang) {
        switch (lang) {
            case  "tamil": return tamilSpellChecker.checkSpelling(text);
            default:
            case "english":
                return englishSpellChecker.checkSpelling(text);
        }
    }
}
