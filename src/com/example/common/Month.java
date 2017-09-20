package com.example.common;

public enum Month {

  JANUARY("january"),
  FEBRUARY("february"),
  MARCH("march"),
  APRIL("april"),
  MAY("may"),
  JUNE("june"),
  JULY("july"),
  AUGUST("august"),
  SEPTEMBER("september"),
  OCTOBER("october"),
  NOVEMBER("november"),
  DECEMBER("december");

  private String englishName;

  public String getEnglishName() {
    return englishName;
  }

  Month(String englishName) {
    this.englishName = englishName;
  }

  @Override
  public String toString() {
    return  this.englishName;
  }
}
