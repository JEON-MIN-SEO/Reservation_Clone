package mate.prototype_Apple_reservation.controller.api;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class API_ReservationController {
    // 입소자 명부 모두 조회
    // http://localhost:8080/elderly
    @GetMapping
    public List<ElderlyDTO> getAllElderly() {
        return elderlyService.findAll();
    }

    // 입소자 명부 추가
    // http://localhost:8080/elderly
    @PostMapping
    public ResponseEntity<Void> createElderly(@Valid @RequestBody ElderlyDTO elderly) {
        elderlyService.save(elderly);
        return ResponseEntity.ok().build();
    }

}

