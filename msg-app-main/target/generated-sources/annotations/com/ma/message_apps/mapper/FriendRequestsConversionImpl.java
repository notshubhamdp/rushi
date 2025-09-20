package com.ma.message_apps.mapper;

import com.ma.message_apps.dto.FriendRequestsDto;
import com.ma.message_apps.entity.FriendRequests;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-20T19:51:54+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.16 (Microsoft)"
)
@Component
public class FriendRequestsConversionImpl implements FriendRequestsConversion {

    @Override
    public FriendRequestsDto fromEntity(FriendRequests friendRequests) {
        if ( friendRequests == null ) {
            return null;
        }

        FriendRequestsDto friendRequestsDto = new FriendRequestsDto();

        friendRequestsDto.setRequestId( friendRequests.getRequestId() );
        friendRequestsDto.setSender( friendRequests.getSender() );
        friendRequestsDto.setReceiver( friendRequests.getReceiver() );
        friendRequestsDto.setStatus( friendRequests.getStatus() );
        friendRequestsDto.setCreatedAt( friendRequests.getCreatedAt() );

        return friendRequestsDto;
    }

    @Override
    public FriendRequests toEntity(FriendRequestsDto friendRequestsDto) {
        if ( friendRequestsDto == null ) {
            return null;
        }

        FriendRequests friendRequests = new FriendRequests();

        friendRequests.setRequestId( friendRequestsDto.getRequestId() );
        friendRequests.setSender( friendRequestsDto.getSender() );
        friendRequests.setReceiver( friendRequestsDto.getReceiver() );
        friendRequests.setStatus( friendRequestsDto.getStatus() );
        friendRequests.setCreatedAt( friendRequestsDto.getCreatedAt() );

        return friendRequests;
    }
}
