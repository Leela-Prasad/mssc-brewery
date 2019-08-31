package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto newBeer);

    void updateBeer(UUID beerId, BeerDto beer);

    void deleteBeer(UUID beerId);
}
