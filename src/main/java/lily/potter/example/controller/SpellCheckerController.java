package lily.potter.example.controller;

import lily.potter.example.pojo.SpellCheckerRequest;
import lily.potter.example.pojo.SpellCheckerResponse;
import lily.potter.example.service.SpellCheckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpellCheckerController {

    @Autowired
    SpellCheckerService spellCheckerService;

    @PostMapping(path = "spell_check")
    public SpellCheckerResponse checkSpelling(@RequestBody SpellCheckerRequest request) {
        SpellCheckerResponse response = new SpellCheckerResponse();
        response.hasErrors = spellCheckerService.checkSpelling(request.text, request.language);
        return response;
    }
}
