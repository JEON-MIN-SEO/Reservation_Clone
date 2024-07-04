package mate.prototype_Apple_reservation.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

