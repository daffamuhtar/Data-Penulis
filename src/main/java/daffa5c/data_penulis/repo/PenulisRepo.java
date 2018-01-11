package daffa5c.data_penulis.repo;

import daffa5c.data_penulis.entity.Penulis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PenulisRepo

	extends JpaRepository<Penulis,String> {}