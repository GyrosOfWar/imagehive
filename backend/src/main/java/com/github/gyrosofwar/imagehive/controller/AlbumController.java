package com.github.gyrosofwar.imagehive.controller;

import static com.github.gyrosofwar.imagehive.controller.ControllerHelper.getUserId;

import com.github.gyrosofwar.imagehive.dto.album.AlbumDetailsDTO;
import com.github.gyrosofwar.imagehive.dto.album.AlbumListDTO;
import com.github.gyrosofwar.imagehive.dto.album.CreateAlbumDTO;
import com.github.gyrosofwar.imagehive.dto.image.ImageDetailsDTO;
import com.github.gyrosofwar.imagehive.service.AlbumService;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.*;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.rules.SecurityRule;
import java.util.*;

@Controller("/api/albums")
@Secured({ SecurityRule.IS_AUTHENTICATED })
public class AlbumController {

  private final AlbumService albumService;

  public AlbumController(AlbumService albumService) {
    this.albumService = albumService;
  }

  @Get
  public List<AlbumListDTO> listAlbums(Pageable pageable, Authentication authentication) {
    var userId = getUserId(authentication);
    return albumService.listAlbums(pageable, userId);
  }

  @Get("{id}")
  public AlbumDetailsDTO getAlbum(@PathVariable long id, Authentication authentication) {
    var userId = getUserId(authentication);

    return albumService.getAlbum(id, userId);
  }

  @Get("{id}/images")
  public List<ImageDetailsDTO> getAlbumImages(
    @PathVariable long id,
    Authentication authentication
  ) {
    var userId = getUserId(authentication);

    return albumService.getImages(id, userId);
  }

  @Post
  public AlbumDetailsDTO createAlbum(@Body CreateAlbumDTO newAlbum, Authentication authentication) {
    var userId = getUserId(authentication);

    return albumService.createAlbum(newAlbum, userId);
  }

  @Post("/{id}/images")
  public void updateAlbumImages(
    @PathVariable long id,
    @Body Set<UUID> albumImages,
    Authentication authentication
  ) {
    albumService.updateAlbumImages(id, new TreeSet<>(albumImages), getUserId(authentication));
  }
}
