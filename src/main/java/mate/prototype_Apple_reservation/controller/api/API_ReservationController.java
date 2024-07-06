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

    // 입소자 명부 수정
    // http://localhost:8080/elderly/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateElderly(@PathVariable("id") Long id, @Valid @RequestBody ElderlyDTO elderlyDetails) {
        elderlyService.updateElderly(id, elderlyDetails);
        return ResponseEntity.ok().build();
    }

    // 입소자 명부 삭제
    // http://localhost:8080/elderly/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteElderly(@PathVariable("id") Long id) {
        elderlyService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    // 어르신 이름 검증
    // http://localhost:8080/elderly/findByName?name={name}
    @GetMapping("/findByName")
    public ResponseEntity<Long> getElderlyIdByName(@RequestParam("name") String name) {
        ElderlyDTO elderly = elderlyService.findByName(name);
        return ResponseEntity.ok(elderly.getElderlyId());
    }

}

