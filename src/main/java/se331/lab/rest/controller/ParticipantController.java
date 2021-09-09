package se331.lab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.lab.rest.service.ParticipantService;
import se331.lab.rest.util.Labmapper;

import java.util.List;

@RestController
public class ParticipantController {
    @Autowired
    ParticipantService participantService;
    @GetMapping("/participants")
    ResponseEntity<?> getParticipants(){
        return ResponseEntity.ok(Labmapper.INSTANCE.getParticipantDTO(participantService.getAllParticipant()));
    }
}
