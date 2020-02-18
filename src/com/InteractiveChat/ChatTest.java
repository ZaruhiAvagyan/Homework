package com.InteractiveChat;

import java.util.ArrayList;
import java.util.Iterator;
public class ChatTest
{
    public static void main(String[] args) {

        ChatMember[] initializedMembers = Chat.initChatMembers();
        ArrayList<ChatMember> activeMembers = Chat.getActiveMembers(initializedMembers);

        Iterator<ChatMember> iterator = activeMembers.iterator();
        while(iterator.hasNext())
        {
            ChatMember temp = iterator.next();
            System.out.printf("%s choose an option!\n", temp.getName());

            switch(Chat.displayActions())
            {
                case 1:
                    System.out.println("You are sending a message!");
                    DateAndTime.getCurrentTime();
                    break;
                case 2:
                    System.out.println("You are exiting the chat. Goodbye!");
                    DateAndTime.getCurrentTime();
                    temp.setActive(false);
                    break;
            }
        }
    }
}
