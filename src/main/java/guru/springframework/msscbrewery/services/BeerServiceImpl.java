package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .bearName("Galaxy Cat")
                .bearStyle("Pale Ale")
                .upc(1000L)
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto newBeer) {
        return newBeer.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beer) {
        //TODO Need to implement
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.info("Deleting Beer ... ");
    }
}
