# TP 19 : Orchestration de microservices avec Spring Cloud: Eureka, Gateway et OpenFeign

---

### Réalisé par

**Abla MARGHOUB**

### Encadré par

**Pr. Mohamed LACHGAR**

### Module

**Techniques de Programmation Avancée**

### Établissement

**École Normale Supérieure - Université Cadi Ayyad**

---


## 1. **Objectif du TP**

L’objectif de ce TP est de mettre en place une architecture microservices composée de deux services indépendants :

* **SERVICE-CLIENT** : gère les données des clients.
* **SERVICE-VOITURE** : gère les voitures, et récupère les informations du client associé grâce à un appel **Feign**.

Le tout s’appuie sur :

* Un **API Gateway** pour router les requêtes.
* Un **Eureka Server** pour la découverte de services.
* Une communication interne entre microservices via **OpenFeign**.

---

## 2. **Architecture du TP**

### 2.1 **Stack technologique**

| Composant             | Technologie              | Rôle                                      |
| --------------------- | ------------------------ | ----------------------------------------- |
| Backend microservices | **Spring Boot**          | Développement des services                |
| Service Discovery     | **Spring Cloud Eureka**  | Enregistrement et découverte des services |
| API Gateway           | **Spring Cloud Gateway** | Routage des requêtes                      |
| Communication interne | **OpenFeign**            | Appels HTTP entre microservices           |
| Base de données       | **H2 / MySQL**           | Stockage local (selon configuration)      |
| Outil client          | **Browser**              | Test des endpoints                        |
| Build                 | **Maven**                | Gestion des dépendances                   |


### 2.2 **Structure du projet**

Structure simplifiée du TP :
_**eureka-server**_

<img width="543" height="464" alt="image" src="https://github.com/user-attachments/assets/8c4e9c01-f60e-4579-9aae-68b108623975" />

_**GateWay**_

<img width="692" height="527" alt="image" src="https://github.com/user-attachments/assets/f33daeac-99fc-4c76-a6ec-d37584f839e5" />

_**Client**_

<img width="500" height="577" alt="image" src="https://github.com/user-attachments/assets/bfc9c99e-4a6e-4cb6-9a6f-c818357d0687" />

_**SERVICE-VOITURE**_

<img width="468" height="768" alt="image" src="https://github.com/user-attachments/assets/9430fb25-3d96-4325-b0cd-7dc19b1fd760" />

---

## 3. **Résultat attendu**

###  1. Enregistrement correct dans Eureka

<img width="1164" height="660" alt="image" src="https://github.com/user-attachments/assets/dda1756f-6f7b-4aa5-85ab-7db172b96009" />

<img width="899" height="954" alt="image" src="https://github.com/user-attachments/assets/c71510ce-15ee-49bf-88ae-0a04e70dfd11" />

### 2. Liste des Clients 
`http://localhost:8088/clients`

<img width="623" height="534" alt="image" src="https://github.com/user-attachments/assets/6deb8637-ea7d-484f-842e-602707bc0a9c" />

`http://localhost:8088/client/1`

<img width="540" height="320" alt="image" src="https://github.com/user-attachments/assets/13871f58-9eea-45a5-a712-3e38470c0dda" />

`http://172.28.208.1:8888/SERVICE-CLIENT/clients`

<img width="604" height="459" alt="image" src="https://github.com/user-attachments/assets/daee69e6-069d-47c4-85c1-3d6f39c9f80f" />

`http://localhost:8888/clients`

<img width="565" height="450" alt="image" src="https://github.com/user-attachments/assets/d17673b1-ef22-4150-bad4-38478d305c0f" />

`http://localhost:8888/clients`

<img width="624" height="253" alt="image" src="https://github.com/user-attachments/assets/cd1799f7-d72b-4a16-be75-c5e0069dc30e" />


### 3. Liste des voitures
`http://localhost:8089/voitures`

<img width="601" height="798" alt="image" src="https://github.com/user-attachments/assets/d12dd167-cfac-497c-a65f-7a35b0820339" />

`http://localhost:8888/SERVICE-VOITURE/voitures`

<img width="643" height="798" alt="image" src="https://github.com/user-attachments/assets/f9fd8ad3-3b4f-4225-bb9e-4a45001ea629" />

`http://localhost:8089/voitures/1`

<img width="626" height="402" alt="image" src="https://github.com/user-attachments/assets/a93b9303-6cad-4c93-b5ce-a931466a5f71" />

