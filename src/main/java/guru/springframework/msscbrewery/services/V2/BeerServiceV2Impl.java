package guru.springframework.msscbrewery.services.V2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {


    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .bearName("Galaxy Cat")
                .bearStyle(BeerStyle.GOSE)
                .upc(1000L)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 newBeer) {
        return newBeer.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beer) {
        log.info("Updating Beer V2 ... ");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.info("Deleting Beer V2 ... ");
    }
}
