package com.hz;

import com.hz.EmailBuilder;

public class DutchEmailBuilder implements EmailBuilder {

    private String _email = "";

    public void reset() {
        _email = "";
    }

    public void addressSir(String receiver) {
        _email += "Beste" + receiver;
        this.addNewLine();
    }

    public void addressMadam(String receiver) {
        _email +="Beste" + receiver;
        this.addNewLine();
    }

    public void addressSomeone(String receiver) {
        _email += "Geachte heer/mevrouw";
        this.addNewLine();
    }

    public void talkAboutMe(String name, String university) {
        _email +=  " Mijn naam is " + name + " en ik ben net afgestudeerd aan" + university;
        this.addNewLine();
    }

    public void showInterest(String company) {
        _email += " I am emailing to ask about potential interning opportunity at   Ik stuur deze email  " + company;
        this.addNewLine();
        _email += "Id love to learn more about "
                + company;
        this.addNewLine();
        _email += "please let me know if you have any internships available";
        this.addNewLine();

    }

    public void tellHowtoContactMe() {
        _email += " you can reach me via email or cellphone";
        this.addNewLine();
    }

    public void sayThanks() {
        _email  += " thank you so much for your time I am looking forward to hearing from you :)";
    }

    private void addNewLine() {
        _email +="\n\r";
    }

    public String getEmail() {
        return _email;
    }
}
