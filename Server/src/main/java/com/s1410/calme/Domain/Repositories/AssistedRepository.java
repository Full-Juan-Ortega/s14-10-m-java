package com.s1410.calme.Domain.Repositories;

import com.s1410.calme.Domain.Entities.Assisted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistedRepository extends JpaRepository <Assisted, Long>{


    @Query("SELECT p FROM Assisted p WHERE p.DNI = ?1")
    Assisted findByDNI(String dni);

}
