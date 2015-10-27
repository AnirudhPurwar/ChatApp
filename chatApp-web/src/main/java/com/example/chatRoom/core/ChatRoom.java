package com.example.chatRoom.core;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom
{
    private final String name;
    private List<String> messages = new ArrayList<>();
    private List<String> users = new ArrayList<>();

    public List<String> getUsers()
    {
        return users;
    }

    public List<String> getMessages()
    {
        return messages;
    }

    public String getName()
    {
        return name;
    }


    public ChatRoom(String name)
    {
        this.name = name;
    }
}