package lily.potter.example.controller;

import lily.potter.example.pojo.SpellCheckerRequest;
import lily.potter.example.pojo.SpellCheckerResponse;
import lily.potter.example.service.SpellCheckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class SpellCheckerController {

    @Autowired
    SpellCheckerService spellCheckerService;

    @PostMapping(value = {"spell_check/{language}", "spell_check"})
    public SpellCheckerResponse checkSpelling(@RequestBody SpellCheckerRequest request, @PathVariable(required = false) Optional<String> language) {
        SpellCheckerResponse response = new SpellCheckerResponse();
        response.hasErrors = spellCheckerService.checkSpelling(request.text, language.orElse("english"));
        return response;
    }
}
