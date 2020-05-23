package lily.potter.example.util;

import org.springframework.lang.NonNull;

public class EnglishSpellChecker implements SpellChecker{
    @Override
    public boolean checkSpelling(@NonNull String string) {
        return false;
    }
}
