package org.factoriaf5.bftp2project4grupo5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface LegacyGameRepository extends JpaRepository<Game, Long > {}

