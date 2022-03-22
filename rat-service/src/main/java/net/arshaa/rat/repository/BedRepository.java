package net.arshaa.rat.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.arshaa.rat.entity.Bed;

public interface BedRepository extends JpaRepository<Bed, Integer> {
    Optional<List<Bed>> findByroomId(Integer id);

    //List<Bed> findBybuildingId(Integer id);
    List<Bed> findByBedStatus(Boolean status);

    //List<Bed> findByBedStatusandId(int id, Boolean status);
    Optional<List<Bed>> findByroomIdAndBedStatus(int roomId, boolean b);

    Optional<List<Bed>> findBybuildingIdAndBedStatus(int building_id, boolean b);

    Bed findByBedId(String bedId);

    Bed findByBedNum(int id);

    List<Bed> findAllByBuildingId(int buildingId);


}
