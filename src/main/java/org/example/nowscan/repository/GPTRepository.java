package org.example.nowscan.repository;

import org.example.nowscan.entity.GPTResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GPTRepository extends JpaRepository<GPTResponse,String > {
}
