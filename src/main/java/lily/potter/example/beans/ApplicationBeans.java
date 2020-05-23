package lily.potter.example.beans;

import lily.potter.example.service.SpellCheckerService;
import lily.potter.example.util.EnglishSpellChecker;
import lily.potter.example.util.TamilSpellChecker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {

    @Bean
    public EnglishSpellChecker getEnglishSpellChecker(){
        return new EnglishSpellChecker();
    }

    @Bean
    public TamilSpellChecker getTamilSpellChecker(){
        return new TamilSpellChecker();
    }

    @Bean
    public SpellCheckerService getSpellCheckerService(){
        return new SpellCheckerService();
    }
}
