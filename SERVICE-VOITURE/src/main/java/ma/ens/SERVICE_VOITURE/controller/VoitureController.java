package ma.ens.SERVICE_VOITURE.controller;

import ma.ens.SERVICE_VOITURE.entities.Voiture;
import ma.ens.SERVICE_VOITURE.entities.Client;
import ma.ens.SERVICE_VOITURE.repositories.VoitureRepository;
import ma.ens.SERVICE_VOITURE.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @Autowired
    private ClientService clientService;

    @GetMapping("/voitures")
    public List<Voiture> findAll() {
        List<Voiture> voitures = voitureRepository.findAll();

        voitures.forEach(v -> {
            Client client = clientService.clientById(v.getId_client());
            v.setClient(client);
        });

        return voitures;
    }

    @GetMapping("/voitures/{id}")
    public Voiture findById(@PathVariable Long id) throws Exception {
        Voiture voiture = voitureRepository.findById(id)
                .orElseThrow(() -> new Exception("Voiture non trouvée"));

        Client client = clientService.clientById(voiture.getId_client());
        voiture.setClient(client);

        return voiture;
    }
}
