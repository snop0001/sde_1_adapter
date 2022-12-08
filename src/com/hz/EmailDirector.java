package com.hz;

public class EmailDirector {
    private EmailBuilder _builder;

    public EmailDirector(EmailBuilder builder) {
        _builder = builder;
    }

    public void ChangeBuilder(EmailBuilder builder) {
        _builder = builder;
    }

    public String makeEmailApplyForInternship(){
        _builder.addressMadam("Manon");
        _builder.talkAboutMe("Shirel","HZ");
        _builder.showInterest("Manon`s Company");
        _builder.tellHowtoContactMe();
        _builder.sayThanks();

        return _builder.getEmail();
    }
}
