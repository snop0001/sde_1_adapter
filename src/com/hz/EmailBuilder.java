package com.hz;

public interface EmailBuilder {
    void reset();

    void addressSir(String receiver);

    void addressMadam(String receiver);

    void addressSomeone(String receiver);

    void talkAboutMe(String name, String university);

    void showInterest(String company);

    void tellHowtoContactMe();

    void sayThanks();

    String getEmail();
}


