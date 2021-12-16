package pl.rafal.hotelsapplication.remote.dto.request;

import java.util.List;

public class HotelsReservationDto {
    private PersonDto person;
    private List<HotelReservationDto> hotels;

    public HotelsReservationDto() {
    }

    public HotelsReservationDto(PersonDto person, List<HotelReservationDto> hotels) {
        this.person = person;
        this.hotels = hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public List<HotelReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelReservationDto> hotels) {
        this.hotels = hotels;
    }
}
