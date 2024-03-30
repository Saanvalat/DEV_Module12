package test;

import config.Client;
import config.Planet;
import dao.ClientDao;
import servicecrud.ClientCrudService;
import servicecrud.PlanetCrudService;

public class CrudTest {

    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();

        Client client = new Client();
        client.setName("Darth Vader");
        clientService.saveClient(client);

        Client retrievedClient = clientService.findClientById((long) client.getId());
        System.out.println("Retrieved client: " + retrievedClient.getName());

        clientService.deleteClient(retrievedClient);

        Planet planet = new Planet();
        planet.setId("MARS");
        planet.setName("Mars");
        planetService.savePlanet(planet);

        Planet retrievedPlanet = planetService.findPlanetById(planet.getId());
        System.out.println("Retrieved planet: " + retrievedPlanet.getName());

        planetService.deletePlanet(retrievedPlanet);
    }



}
