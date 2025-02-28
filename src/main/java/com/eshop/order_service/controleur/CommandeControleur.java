package main.java.com.eshop.order_service.controleur;

import main.java.com.eshop.order_service.entite.Commande;
import main.java.com.eshop.order_service.service.CommandeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")  // Toutes les routes commenceront par /commandes
@RequiredArgsConstructor
public class CommandeControleur {
    private final CommandeService service;

    // Endpoint pour créer une nouvelle commande
    @PostMapping
    public ResponseEntity<Commande> creerCommande(@RequestBody Commande commande) {
        return ResponseEntity.ok(service.creerCommande(commande));
    }

    // Endpoint pour récupérer toutes les commandes
    @GetMapping
    public ResponseEntity<List<Commande>> obtenirToutesLesCommandes() {
        return ResponseEntity.ok(service.obtenirToutesLesCommandes());
    }
}
