package com.mpakhomov.builder;

import java.sql.Date;

/**
 * Builder is a creation design pattern from the GoF book. It's useful when object configuration is complex
 * and / or there too many arguments in the constructor
 *
 * @author mpakhomov
 * @since 8/30/15
 */
public class StatisticsLogger {

    private final boolean isWriteToDb;
    private final boolean isWriteToConsole;
    private final Date runDate;
    private final boolean isVerbose;

    /**
     * private constructor
     *
     * @param isWriteToDb denotes whether to write statistics to DB
     * @param isWriteToConsole denotes whether to write statistics to console
     * @param runDate business date
     * @param isVerbose denotes how verbose output should be
     */
    private StatisticsLogger(boolean isWriteToDb,
                             boolean isWriteToConsole,
                             Date runDate,
                             boolean isVerbose) {
        this.isWriteToDb = isWriteToDb;
        this.isWriteToConsole = isWriteToConsole;
        this.runDate = runDate;
        this.isVerbose = isVerbose;
    }

    public void log(String message) {
        System.out.println("isWriteToDb: " + isWriteToDb + ", isWriteToConsole: " + isWriteToConsole +
            ", runDate: " + runDate + ", isVerbose: " + isVerbose + ", msg:" + message);
    }

    /**
     * factory method that returns the builder
     *
     * @return the builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * static class that encapsulates building {@link com.mpakhomov.builder.StatisticsLogger}
     *
     * @return the builder object
     */
    public static class Builder {
        // defaults
        private boolean isWriteToDb = true;
        private boolean isWriteToConsole = true;
        private Date runDate = new Date(System.currentTimeMillis());
        private boolean isVerbose = true;

        public Builder withWriteToDb(boolean isWriteToDb) {
            this.isWriteToDb = isWriteToDb;
            return this;
        }

        public Builder withWriteToConsole(boolean isWriteToConsole) {
            this.isWriteToConsole = isWriteToConsole;
            return this;
        }

        public Builder withRunDate(Date runDate) {
            this.runDate = runDate;
            return this;
        }

        public Builder withVerbose(boolean isVerbose) {
            this.isVerbose = isVerbose;
            return this;
        }

        public StatisticsLogger build() {
            return new StatisticsLogger(isWriteToDb,
                                        isWriteToConsole,
                                        runDate,
                                        isVerbose);
        }

    }

    public boolean isWriteToDb() {
        return isWriteToDb;
    }

    public boolean isWriteToConsole() {
        return isWriteToConsole;
    }

    public Date getRunDate() {
        return runDate;
    }

    public boolean isVerbose() {
        return isVerbose;
    }
}
