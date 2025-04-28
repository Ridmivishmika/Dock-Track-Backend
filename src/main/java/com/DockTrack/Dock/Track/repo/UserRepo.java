package com.DockTrack.Dock.Track.repo;

import com.DockTrack.Dock.Track.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel,String> {

}
