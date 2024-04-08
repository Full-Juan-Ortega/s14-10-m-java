package com.s1410.calme.Infrastructure.Controllers;

import com.s1410.calme.Domain.Dtos.request.RequestCreateAssisted;
import com.s1410.calme.Domain.Dtos.request.RequestEditAssisted;
import com.s1410.calme.Domain.Dtos.response.ResponseAssisted;
import com.s1410.calme.Domain.Dtos.response.ResponseAssistent;
import com.s1410.calme.Domain.Services.AssistedService;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.NoResultException;
import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/assisted")
@RestController
@RequiredArgsConstructor
public class AssistedController {

    public final AssistedService assistedService;

    @PostMapping("/create-assisted")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseAssisted registerAssisted(
            @RequestBody
            @Valid
            RequestCreateAssisted createAssisted
    ) {
        try {
            return this.assistedService.createAssisted(createAssisted);
        } catch (EntityExistsException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }


    @GetMapping("/id/{id}")
    public ResponseEntity<ResponseAssisted> findAssisted(@PathVariable Long id){
        return ResponseEntity.ok(assistedService.readAssisted(id));
    }


    @GetMapping("/all")
    public ResponseEntity<List<ResponseAssisted>> findAllAssisted() {
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseAssisted> updateAssisted(
            @RequestBody @Valid @NonNull RequestEditAssisted editAssisted) {

        try {
            return ResponseEntity.ok(assistedService.updateAssisted(editAssisted));
        } catch (NoResultException e) {
            throw new EntityNotFoundException();
        }

    }

    @DeleteMapping("/{relationAAId}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Boolean removeAssistedToAssistant(@PathVariable Long relationAAId) {
        try {
            return this.assistedService.unlinkAssistedFromAssistant(relationAAId);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException(e.getMessage());
        }
    }
}
