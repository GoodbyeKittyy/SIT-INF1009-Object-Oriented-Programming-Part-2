package com.mygdx.game_engine;

import java.util.ArrayList;
import java.util.List;

public class EntityManager {
    private List<Entities> entitiesList;

    public EntityManager() {
        entitiesList = new ArrayList<>();
    }

    public void addEntity(Entities entity) {
        entitiesList.add(entity);
    }

    public void removeEntity(Entities entity) {
        entitiesList.remove(entity);
    }

    // You can add more methods for managing entities as needed
}
