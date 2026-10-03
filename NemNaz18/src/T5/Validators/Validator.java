package T5.Validators;

import T5.Exceptions.ValidateException;

public interface Validator {
    void validate(String value) throws ValidateException;
}
