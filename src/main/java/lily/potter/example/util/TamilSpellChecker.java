package lily.potter.example.util;

import org.springframework.lang.NonNull;

public class TamilSpellChecker implements SpellChecker{
    @Override
    public boolean checkSpelling(@NonNull String string) {
        return true;
    }
}
