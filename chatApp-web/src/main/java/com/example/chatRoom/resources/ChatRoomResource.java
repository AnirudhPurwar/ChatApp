package com.example.chatRoom.resources;

import com.example.chatRoom.core.ChatRoom;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/chatRoom")
@Produces(MediaType.APPLICATION_JSON)
public class ChatRoomResource
{

    ChatRoom myChatRoom;

    @POST
    @Path("/create/{name}")
    public void createChatRoom(@PathParam("name") String name)
    {
        myChatRoom =  new ChatRoom(name);
    }

    @POST
    @Path("/users/{userID}")
    public void updateUserList(@PathParam("userID") String userID)
    {
        myChatRoom.getUsers().add(userID);
    }

    @POST
    @Path("/messages/{message}")
    public void updateMessageList(@PathParam("message") String message)
    {
        myChatRoom.getMessages().add(message);
    }

    @GET
    @Path("/messages")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getChatRoom()
    {

        return myChatRoom.getMessages();
    }
}