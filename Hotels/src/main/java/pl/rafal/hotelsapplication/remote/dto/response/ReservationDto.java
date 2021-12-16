package pl.rafal.hotelsapplication.remote.dto.response;

import pl.rafal.hotelsapplication.domain.model.ReservationType;
import pl.rafal.hotelsapplication.remote.dto.request.HotelReservationDto;
import pl.rafal.hotelsapplication.remote.dto.request.PersonDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationType status;
    private List<HotelReservationDto> room;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationType status, List<HotelReservationDto> room, PersonDto person) {
        this.id = id;
        this.status = status;
        this.room = room;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationType getStatus() {
        return status;
    }

    public void setStatus(ReservationType status) {
        this.status = status;
    }

    public List<HotelReservationDto> getRoom() {
        return room;
    }

    public void setRoom(List<HotelReservationDto> room) {
        this.room = room;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
