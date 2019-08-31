package guru.springframework.msscbrewery.services.V2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 newBeer);

    void updateBeer(UUID beerId, BeerDtoV2 beer);

    void deleteBeer(UUID beerId);
}
