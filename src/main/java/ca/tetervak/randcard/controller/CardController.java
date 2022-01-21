package ca.tetervak.randcard.controller;

import ca.tetervak.randcard.domain.RandCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController {

    private final Logger logger = LoggerFactory.getLogger(CardController.class);

    @GetMapping(value={"/", "/random-card"})
    public String card(Model model){
        logger.trace("card() is called");

        RandCard card = new RandCard();
        logger.debug("card = " + card);

        model.addAttribute("card", card);
        return "Card";
    }


}
