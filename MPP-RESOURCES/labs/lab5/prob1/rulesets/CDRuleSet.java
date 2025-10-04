package labs.lab5.prob1.rulesets;

import java.awt.Component;
import labs.lab5.prob1.gui.*;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
    private CDWindow cd;

    @Override
    public void applyRules(Component ob) throws RuleException {
        cd = (CDWindow) ob;
        nonemptyRule();
        priceRule();
    }

    private void nonemptyRule() throws RuleException {
        if (
                cd.getTitleValue().trim().isEmpty() ||
                        cd.getPriceValue().trim().isEmpty() ||
                        cd.getArtistValue().trim().isEmpty()
        ) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

    private void priceRule() throws RuleException {
        String priceStr = cd.getPriceValue().trim();

        double price;
        try {
            price = Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a valid number with two decimal places.");
        }

        if (price <= 0.49) {
            throw new RuleException("Price must be greater than 0.49.");
        }

        if (!priceStr.matches("\\d+\\.\\d{2}")) {
            throw new RuleException("Price must have exactly two decimal places.");
        }
    }
}