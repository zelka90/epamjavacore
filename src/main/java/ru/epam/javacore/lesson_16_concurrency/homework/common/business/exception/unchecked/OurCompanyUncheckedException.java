package ru.epam.javacore.lesson_16_concurrency.homework.common.business.exception.unchecked;

public class OurCompanyUncheckedException extends RuntimeException {

  public OurCompanyUncheckedException(String message) {
    super(message);
  }
}
