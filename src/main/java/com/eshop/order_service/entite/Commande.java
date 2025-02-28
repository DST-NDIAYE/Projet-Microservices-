
package main.java.com.eshop.order_service.entite;

import jakarta.persistence.*;
import lombok.*;

@Entity  // Indique que cette classe est une table en base de données
@Data    // Génère automatiquement les accesseurs (getters/setters) et toString
@NoArgsConstructor  // Génère un constructeur sans paramètres
@AllArgsConstructor // Génère un constructeur avec tous les paramètres
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID auto-incrémenté
    private Long id;
    private String produit;
    private int quantite;
    private double prix;
}
