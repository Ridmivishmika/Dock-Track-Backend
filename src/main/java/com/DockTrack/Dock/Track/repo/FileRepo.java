package com.DockTrack.Dock.Track.repo;

import com.DockTrack.Dock.Track.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo  extends JpaRepository<FileModel,String> {
}
