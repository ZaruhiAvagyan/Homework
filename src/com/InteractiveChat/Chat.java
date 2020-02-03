package com.InteractiveChat;

import java.util.Scanner;
import java.util.ArrayList;

public class Chat
{
    private static int membersCount;
    private static ChatMember[] members;
    static Scanner input = new Scanner(System.in);

    public static ChatMember[] initChatMembers() {
        System.out.print("Input number of chat members: ");

        membersCount = input.nextInt();
        members = new ChatMember[membersCount];

        int index = 0;
        while(index < membersCount) {
            System.out.print("Please enter member name: ");
            String name = input.next();

            System.out.print("Please enter 1 if the member is active and 2 if not: ");
            int isActive = input.nextInt();

            switch (isActive){
                case 1:
                    members[index] = new ChatMember(name, true);
                    break;
                case 2:
                    members[index] = new ChatMember(name, false);
                    break;

            }
            index++;
        }
        System.out.printf("\nThere are totally %d members in a chat!\n", membersCount);
        return members;
    }

    public static int displayActions()
    {
        System.out.println("Press number for action:");
        System.out.println("1. Send message");
        System.out.println("2. Exit chat");
        int choice = input.nextInt();
        return choice;
    }

    public static ArrayList<ChatMember> getActiveMembers(ChatMember[] allMembers)
    {
        ArrayList<ChatMember> activeMembersList = new ArrayList<>();
        for (int i = 0; i < allMembers.length; i++) {
            if(allMembers[i].isActive())
            {
                activeMembersList.add(allMembers[i]);
            }
            else
                activeMembersList.remove(allMembers[i]);
        }
        return activeMembersList;
    }


}
