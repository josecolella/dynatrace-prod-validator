package com.dynatrace.installvalidator.profile.validator;

/**
 * Created by kristof on 05.05.15.
 */
public interface SensorConfigValidator<SensorType> {

    ValidationResult validate();
}