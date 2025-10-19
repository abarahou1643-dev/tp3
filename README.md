=== Test des relations et des opérations en cascade ===
✓ Entités créées et liées avec succès !
        u1_0.id=?
Utilisateur : Utilisateur{id=1, nom='Dupont', prenom='Jean', email='jean.dupont@example.com'}
Nombre de réservations : 1
Salle : Salle{id=1, nom='Salle A101', capacite=30, description='Salle de réunion équipée d'un projecteur'}
Nombre de réservations : 1

=== Test de la suppression orpheline ===
✓ Utilisateur avec deux réservations créé !
Nombre de réservations avant suppression : 2
Nombre de réservations après suppression : 1
La réservation existe-t-elle encore ? false

=== Test de la relation ManyToMany avec Équipement ===
✓ Salles et équipements créés avec succès !
Vérification des relations ManyToMany :
Salle : Salle de réunion D104
- Projecteur
- Système de visioconférence
- Salle : Salle de formation E205

Salle après suppression d'un équipement : Salle de réunion D104
