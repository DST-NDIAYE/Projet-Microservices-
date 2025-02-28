package main.java.com.eshop.order_service.referentiel;

import com.eshop.commandeservice.entite.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
