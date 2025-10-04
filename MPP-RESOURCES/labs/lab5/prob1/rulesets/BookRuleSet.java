package labs.lab5.prob1.rulesets;

import java.awt.Component;

import labs.lab5.prob1.gui.*;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
    private BookWindow bbk;

	@Override
	public void applyRules(Component ob) throws RuleException {
		bbk = (BookWindow) ob;
        nonemptyRule();
        isbnNumericRule();
        isbnLengthRule();
        priceRule();
	}

    private void nonemptyRule() throws RuleException {
        if (
                bbk.getIsbnValue().trim().isEmpty() ||
                bbk.getTitleValue().trim().isEmpty() ||
                bbk.getPriceValue().trim().isEmpty()
        ) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

    private void isbnNumericRule() throws RuleException {
        var val = bbk.getIsbnValue();
        try {
            Long.parseLong(val);
        } catch (NumberFormatException e) {
            throw new RuleException("Isbn must be numeric");
        }
    }

    private void isbnLengthRule() throws RuleException {
        var val = bbk.getIsbnValue().trim();

        if (val.length() != 10 && val.length() != 13) {
            throw new RuleException("Isbn must be either 10 or 13 digits long.");
        }

        if (val.length() == 10) {
            char first = val.charAt(0);
            if (first != '0' && first != '1') {
                throw new RuleException("If ISBN has length 10, the first digit must be 0 or 1.");
            }
        } else { // length == 13
            String prefix = val.substring(0, 3);
            if (!prefix.equals("978") && !prefix.equals("979")) {
                throw new RuleException("If ISBN has length 13, the first three digits must be 978 or 979.");
            }
        }
    }

    private void priceRule() throws RuleException {
        String priceStr = bbk.getPriceValue().trim();

        double price;
        try {
            price = Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a valid number with two decimal places.");
        }

        // Price must be a number greater than 0.49.
        if (price <= 0.49) {
            throw new RuleException("Price must be greater than 0.49.");
        }

        // Price must be a floating point number with two decimal places
        if (!priceStr.matches("\\d+\\.\\d{2}")) {
            throw new RuleException("Price must have exactly two decimal places.");
        }
    }

}
