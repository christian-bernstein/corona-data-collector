package de.christianbernstein.corona;

import java.util.Date;
import java.util.UUID;

public class CoronaDataEntity {

    /**
     * Stores a back tracker to the data collector, ,
     */
    private final UUID datasource;

    private final String dataBranch;

    private final Date timestamp;

    private final int infections;

}
