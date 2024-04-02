package com.AppTurnos.s1410.Infrastructure.Controllers;

import com.AppTurnos.s1410.Domain.Dtos.request.RequestCreateAssistent;
import com.AppTurnos.s1410.Domain.Dtos.request.RequestEditAssistent;
import com.AppTurnos.s1410.Domain.Dtos.response.ResponseAssistent;
import com.AppTurnos.s1410.Domain.Services.AssistentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/assistent")
@RestController
@RequiredArgsConstructor
public class AssistentController {
    public final AssistentService assistentService;

    @PostMapping("/register")
    public ResponseEntity<ResponseAssistent> registerAssistent(@RequestBody
                                                                 RequestCreateAssistent createAssistent){
        return null;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ResponseAssistent> findAssistent(@PathVariable Long id){
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseAssistent>> findAllAssistents(){
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseAssistent> updateAssistent(@RequestBody
                                                             RequestEditAssistent editAssistent){
        return null;
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Boolean> deleteAssistent(@PathVariable Long id){
        return null;
    }
}
