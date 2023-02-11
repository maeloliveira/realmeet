package br.com.sw2you.realmeet;

import static java.util.concurrent.CompletableFuture.supplyAsync;

import br.com.sw2you.realmeet.api.facade.RoomsApi;
import java.util.concurrent.CompletableFuture;
import javax.validation.Valid;

import br.com.sw2you.realmeet.domain.entity.Room;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController implements RoomsApi {

    @Override
    public CompletableFuture<ResponseEntity<Room>> listRooms(@Valid Long id) {
        return supplyAsync(() -> ResponseEntity.ok(new Room()));
    }
}
