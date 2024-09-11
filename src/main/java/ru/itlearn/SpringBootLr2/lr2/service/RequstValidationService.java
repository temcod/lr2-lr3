package ru.itlearn.SpringBootLr2.lr2.service;

import jakarta.validation.ValidationException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.itlearn.SpringBootLr2.lr2.exception.ValidationFailedException;

@Service
public class RequstValidationService implements ValidationService {

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()){
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}
