package com.hz;

public class Main {

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
//        //get input
//        String input = reader.readLine();
//        // respond
//        ChatBox chat = new ChatBox();
//        GoogleStrategy google = new GoogleStrategy();
//        chat.setChatBoxMode(google);
//
//        writer.write(chat.getResponse());

        EnglishEmailBuilder builder = new EnglishEmailBuilder();

        EmailDirector director = new EmailDirector(builder);

        writer.write(director.makeEmailApplyForInternship());

    }
}
