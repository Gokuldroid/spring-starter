package lily.potter.example.util;

import org.springframework.lang.NonNull;

public interface SpellChecker {
    boolean checkSpelling(@NonNull String string);
}
