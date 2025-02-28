package main.java.com.eshop.order_service.service;

import main.java.com.eshop.order_service.entite.Commande;
import main.java.com.eshop.order_service.referentiel.CommandeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeService {
    private final CommandeRepository repository;

    public Commande creerCommande(Commande commande) {
        return repository.save(commande);
    }

    public List<Commande> obtenirToutesLesCommandes() { 
        return repository.findAll();
    }
}
