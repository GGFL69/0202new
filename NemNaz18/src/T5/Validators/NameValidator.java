package T5.Validators;

import T5.Exceptions.ValidateException;
import T5.Exceptions.ValidateNameException;

public class NameValidator implements Validator {
    @Override
    public void validate(final String value) throws ValidateException {
        if (value == null || value.isBlank()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}
