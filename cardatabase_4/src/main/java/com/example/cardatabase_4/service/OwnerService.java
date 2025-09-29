package com.example.cardatabase_4.service;

import com.example.cardatabase_4.domain.Owner;
import com.example.cardatabase_4.domain.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    @Transactional(readOnly = true)
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Owner> getOwnerById(Long id) {
        return ownerRepository.findById(id);
    }

    @Transactional
    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Transactional
    public Owner updateOwner(Long id, Owner updatedOwner) {
        return ownerRepository.findById(id)
                .map(owner -> {
                    owner.setFirstName(updatedOwner.getFirstName());
                    owner.setLastName(updatedOwner.getLastName());
                    // cars 필드는 보통 별도 처리하거나 cascade로 관리하므로 여기서는 간단히 무시
                    return ownerRepository.save(owner);
                })
                .orElseThrow(() -> new RuntimeException("Owner not found with id " + id));
    }

    @Transactional
    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}
