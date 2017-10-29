package io.miret.etienne.benchmark.optional;

import org.openjdk.jmh.annotations.*;

import java.util.Optional;

@State(Scope.Benchmark)
public class OptionalBenchmark {

  private Room room;

  @Param({ "empty", "small", "large", "full" })
  private String filling;

  @Setup
  public void setUp () {
    switch (filling) {
      case "empty":
        room = null;
        break;
      case "small":
        room = new Room(new Flat(new Floor(null)));
        break;
      case "large":
        room = new Room(new Flat(new Floor(new Building(new Block(new District(null))))));
        break;
      case "full":
        room = new Room(new Flat(new Floor(new Building(new Block(new District(new City(new Country("France"))))))));
        break;
      default:
        throw new IllegalStateException("Unsupported filling.");
    }
  }

  @Benchmark
  public void noop () {}

  @Benchmark
  public String nullChecks () {
    if (room == null) {
      return null;
    }

    Flat flat = room.getFlat();
    if (flat == null) {
      return null;
    }

    Floor floor = flat.getFloor();
    if (floor == null) {
      return null;
    }

    Building building = floor.getBuilding();
    if (building == null) {
      return null;
    }

    Block block = building.getBlock();
    if (block == null) {
      return null;
    }

    District district = block.getDistrict();
    if (district == null) {
      return null;
    }

    City city = district.getCity();
    if (city == null) {
      return null;
    }

    Country country = city.getCountry();
    if (country == null) {
      return null;
    }

    return country.getName();
  }

  @Benchmark
  public String optionalsWithMethodRefs () {
    return Optional.ofNullable (room)
        .map (Room::getFlat)
        .map (Flat::getFloor)
        .map (Floor::getBuilding)
        .map (Building::getBlock)
        .map (Block::getDistrict)
        .map (District::getCity)
        .map (City::getCountry)
        .map (Country::getName)
        .orElse (null);
  }

  @Benchmark
  public String optionalsWithLambdas () {
    return Optional.ofNullable (room)
        .map (room -> room.getFlat ())
        .map (flat -> flat.getFloor ())
        .map (floor -> floor.getBuilding ())
        .map (building -> building.getBlock ())
        .map (block -> block.getDistrict ())
        .map (district -> district.getCity ())
        .map (city -> city.getCountry ())
        .map (country -> country.getName ())
        .orElse (null);
  }

}
