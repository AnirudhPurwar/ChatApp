package com.example.chatRoom;



import com.example.chatRoom.resources.ChatRoomResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class ChatRoomServer extends Application<Configuration>
{
    public static void main(String[] args) throws Exception
    {
        new ChatRoomServer().run(args);
    }


    @Override
    public void run(Configuration configuration, Environment environment) throws Exception
    {
        environment.jersey().register(new ChatRoomResource());

    }
}