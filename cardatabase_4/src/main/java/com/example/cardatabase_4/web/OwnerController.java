package com.example.cardatabase_4.web;

import com.example.cardatabase_4.domain.Owner;
import com.example.cardatabase_4.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    // 전체 소유자 목록 조회
    @GetMapping
    public ResponseEntity<List<Owner>> getAllOwners() {
        List<Owner> list = ownerService.getAllOwners();
        return ResponseEntity.ok(list);
    }

    // 단일 소유자 조회
    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable Long id) {
        return ownerService.getOwnerById(id)
                .map(owner -> ResponseEntity.ok(owner))
                .orElse(ResponseEntity.notFound().build());
    }

    // 소유자 생성
    @PostMapping
    public ResponseEntity<Owner> createOwner(@RequestBody Owner owner) {
        Owner saved = ownerService.createOwner(owner);
        return ResponseEntity.ok(saved);
    }

    // 소유자 수정
    @PutMapping("/{id}")
    public ResponseEntity<Owner> updateOwner(
            @PathVariable Long id,
            @RequestBody Owner owner
    ) {
        try {
            Owner updated = ownerService.updateOwner(id, owner);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // 소유자 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long id) {
        ownerService.deleteOwner(id);
        return ResponseEntity.noContent().build();
    }
}
