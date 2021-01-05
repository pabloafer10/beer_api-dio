package one.digitalinnovation.beerstock.mapper;

import javax.annotation.processing.Generated;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.entity.Beer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-02T21:09:58-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        if ( beerDTO.getQuantity() != null ) {
            beer.setQuantity( beerDTO.getQuantity() );
        }
        beer.setMax( beerDTO.getMax() );
        beer.setId( beerDTO.getId() );
        beer.setName( beerDTO.getName() );
        beer.setBrand( beerDTO.getBrand() );
        beer.setType( beerDTO.getType() );

        return beer;
    }

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTO beerDTO = new BeerDTO();

        beerDTO.setName( beer.getName() );
        beerDTO.setId( beer.getId() );
        beerDTO.setQuantity( beer.getQuantity() );
        beerDTO.setMax( beer.getMax() );
        beerDTO.setBrand( beer.getBrand() );
        beerDTO.setType( beer.getType() );

        return beerDTO;
    }
}
