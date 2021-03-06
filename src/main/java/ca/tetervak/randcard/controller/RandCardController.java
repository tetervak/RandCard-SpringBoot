package ca.tetervak.randcard.controller;

import ca.tetervak.randcard.domain.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandCardController {

    private final Logger logger = LoggerFactory.getLogger(RandCardController.class);

    @GetMapping(value={"/", "/Card"})
    public String card(Model model){
        logger.trace("card() is called");

        Card card = new Card();
        logger.debug("card = " + card);

        model.addAttribute("card", card);
        return "Card";
    }


}
