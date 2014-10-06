package org.rapidpm.course.java8.streams.model;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Pair {

  private String txt;
  private int counter;

  private Pair(Builder builder) {
    setTxt(builder.txt);
    setCounter(builder.counter);
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Pair{");
    sb.append("txt='").append(txt).append('\'');
    sb.append(", counter=").append(counter);
    sb.append('}');
    return sb.toString();
  }

  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  public static final class Builder {
    private String txt;
    private int counter;

    public Builder() {
    }

    public Builder txt(String txt) {
      this.txt = txt;
      return this;
    }

    public Builder counter(int counter) {
      this.counter = counter;
      return this;
    }

    public Pair build() {
      return new Pair(this);
    }
  }
}
