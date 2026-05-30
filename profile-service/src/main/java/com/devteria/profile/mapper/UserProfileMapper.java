package com.devteria.profile.mapper;

import com.devteria.profile.dto.request.ProfileCreationRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    // Map User Profile from request
    UserProfile toUserProfile(ProfileCreationRequest request);
    // Map Response from entity
    UserProfileResponse toUserProfileResponse(UserProfile entity);
}
